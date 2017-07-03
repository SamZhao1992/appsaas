package com.app.controller;

import com.app.entity.Apis;
import com.app.entity.Consumer;
import com.app.entity.ResultMap;
import com.app.service.ApisService;
import com.app.service.ConsumerService;
import com.app.util.KongRequestUtil;
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

    @RequestMapping("/{appName}/{targetMethod}")
    public String getById(@PathVariable String appName, @PathVariable String targetMethod, HttpServletRequest request){
        String params = request.getQueryString();
        ResultMap result = new ResultMap();
        Gson gson = new Gson();
        logger.info(appName+","+targetMethod);
        Consumer consumer = consumerService.getConsumerByNameOrId(appName);
        if(consumer != null){
            Apis apis = apiService.getApiByNameOrId(targetMethod);
            if(apis != null){
                String token = KongRequestUtil.createToken(consumer, apis);
            }else{
                result.setCode("500");
                result.setResult("No api method : " + targetMethod);
            }
        }else {
            result.setCode("500");
            result.setResult("No consumer : " + appName);
        }
        return gson.toJson(result);
    }
}
