package com.app.controller;

import com.app.entity.Apis;
import com.app.entity.Consumer;
import com.app.service.ApisService;
import com.app.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/create")
    public String create(Apis apis){
        apis = apiService.createApis(apis);
        return apis.toString();
    }

    @RequestMapping("/{appName}/{method}")
    public String getById(@PathVariable String appName, @PathVariable String method){
        logger.info(appName+","+method);
        Consumer consumer = consumerService.getConsumerByName(appName);
        if(consumer != null){
            return consumer.toString();
        }else
            return "null";
    }
}
