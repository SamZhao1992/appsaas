package com.app.controller;

import com.app.entity.User;
import com.app.service.UserService;
import com.app.util.MD5Utils;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by SamZhao on 2017/7/1.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String list(User user, Model model, HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
        Gson gson = new Gson();
        logger.info(MD5Utils.EncoderByMd5(user.getPassword()));
        user = userService.checkUser(user);
        logger.info(user.toString());

        return gson.toJson("");
    }

    @RequestMapping("/save")
    public String save(User user, Model model, HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
        Gson gson = new Gson();
        user = userService.saveUser(user);
        logger.info(user.toString());
        return gson.toJson("");
    }

}
