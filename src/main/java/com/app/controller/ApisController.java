package com.app.controller;

import com.app.entity.Apis;
import com.app.entity.Consumer;
import com.app.entity.ResultMap;
import com.app.service.ApisService;
import com.app.service.ConsumerService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SamZhao on 2017/7/1.
 */
@RestController
@RequestMapping("/apis")
public class ApisController {

    Logger logger = LoggerFactory.getLogger(ApisController.class);

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private ApisService apiService;

    @RequestMapping("ralate/{appName}/{apiName}")
    public String ralate(@PathVariable String appName, @PathVariable String apiName){
        ResultMap result = new ResultMap();
        Gson gson = new Gson();
        logger.info(appName+","+apiName);
        Consumer consumer = consumerService.getConsumerByNameOrId(appName);
        Apis apis = apiService.getApiByNameOrId(apiName);
        String res = apiService.setRalate(consumer,apis);
        if("success".equals(res))
            result.setCode("200");
        else
            result.setCode("500");
        return gson.toJson(result);
    }

    @RequestMapping("pass/{appName}/{apiName}")
    public String pass(@PathVariable String appName, @PathVariable String apiName, HttpServletRequest request){
        String params = request.getQueryString();
        ResultMap result = new ResultMap();
        Gson gson = new Gson();
        logger.info(appName+","+apiName);
        Consumer consumer = consumerService.getConsumerByNameOrId(appName);
        if(consumer != null){
            Apis apis = apiService.getApiByNameOrId(apiName);
            if(apis != null){
                String apikey = apiService.getRalate(consumer, apis);
                if(null != apikey){
                    String res = apiService.getResult(consumer,apis,params,apikey);
                    result.setCode("200");
                    result.setResult(res);
                }else{
                    result.setCode("500");
                    result.setResult("Wrong api key : " + apiName);
                }
            }else{
                result.setCode("500");
                result.setResult("No api method : " + apiName);
            }
        }else {
            result.setCode("500");
            result.setResult("No consumer : " + appName);
        }
        return gson.toJson(result);
    }
}
