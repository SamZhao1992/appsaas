package com.app.controller;

import com.app.entity.Consumer;
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
public class ConsumerController {

    Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ConsumerService consumerService;



    @RequestMapping("/create")
    public Consumer createConsumer(Consumer consumer){
        consumer = consumerService.createConsumer(consumer);
        return consumer;
    }
}
