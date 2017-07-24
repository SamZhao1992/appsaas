package com.app.service.impl;

import com.app.entity.User;
import com.app.mapper.UserMapper;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 检查用户是否存在
     * @param user
     * @return
     */
    @Override
    public User checkUser(User user) {
        return null;
    }

    /**
     * 注册新用户
     * @param user
     * @return
     */
    @Override
    public User saveUser(User user) {
        return null;
    }
}
