package com.app.controller;

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
@RequestMapping("/consumers")
public class  ConsumerController {

    Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/createKey/{name}/{apiName}")
    public String createConsumer(@PathVariable String name, @PathVariable String apiName){

        return "";
    }
}
