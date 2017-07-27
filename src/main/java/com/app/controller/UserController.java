package com.app.controller;

import com.app.entity.KongUser;
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

    /**
     * 校验用户登录
     * @param user
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/login")
    public String list(KongUser user, Model model, HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
        Gson gson = new Gson();
        logger.info(MD5Utils.EncoderByMd5(user.getPassword()));
        user = userService.loginUser(user);
        if(user != null)
            return gson.toJson(user);
        else
            return gson.toJson("fail");
    }

    /**
     * 新增用户
     * @param user
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/save")
    public String save(KongUser user, Model model, HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
        Gson gson = new Gson();
        int flag = userService.saveUser(user);
        if(flag > 0)
            return gson.toJson("success");
        else
            return gson.toJson("fail");
    }

    /**
     * 修改用户
     * @param user
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/update")
    public String update(KongUser user, Model model, HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
        Gson gson = new Gson();
        int flag = userService.updateUser(user);
        if(flag > 0)
            return gson.toJson("success");
        else
            return gson.toJson("fail");
    }

    /**
     * 检查用户是否存在
     * @param user
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/check")
    public String check(KongUser user, Model model, HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
        Gson gson = new Gson();
        int flag = userService.checkUser(user);
        return gson.toJson(flag);
    }

}
