package com.app.controller;

import com.app.entity.Apis;
import com.app.service.ApisService;
import com.google.gson.Gson;
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
    private ApisService apiService;

    @RequestMapping("/{id}")
    public String list(@PathVariable String id){
        Gson gson = new Gson();
        Apis apis = apiService.findById(id);
        logger.info(apis.toString());
        return gson.toJson(apis);
    }

}
