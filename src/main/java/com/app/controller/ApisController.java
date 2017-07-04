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

    /**
     * 设置绑定关系
     * @param appName
     * @param apiName
     * @return
     */
    @RequestMapping("ralate/{appName}/{apiName}")
    public String ralate(@PathVariable String appName, @PathVariable String apiName){
        ResultMap result = new ResultMap();
        result.setCode("500");
        result.setResult("Fail!");
        Gson gson = new Gson();
        logger.info(appName+","+apiName);
        int res = 0;
        try {
            Consumer consumer = consumerService.getConsumerByNameOrId(appName);
            Apis apis = apiService.getApiByNameOrId(apiName);
            res = apiService.setRalate(consumer,apis);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        if(res > 0){
            result.setCode("200");
            result.setResult("Success!");
        }
        return gson.toJson(result);
    }

    /**
     * 中间接口调用
     * @param appName
     * @param apiName
     * @param request
     * @return
     */
    @RequestMapping("pass/{appName}/{apiName}")
    public String pass(@PathVariable String appName, @PathVariable String apiName, HttpServletRequest request){
        String params = request.getQueryString();
        ResultMap result = new ResultMap();
        result.setCode("500");
        result.setResult("Fail!");
        Gson gson = new Gson();
        logger.info(appName+","+apiName);
        try {
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
                        result.setResult("Wrong api key : " + apiName);
                    }
                }else{
                    result.setResult("No api method : " + apiName);
                }
            }else {
                result.setResult("No consumer : " + appName);
            }
        } catch (Exception e) {
            result.setResult(e.getMessage());
            logger.error(e.getMessage());
        }
        return gson.toJson(result);
    }
}
