package com.app.service;

import com.app.entity.User;

/**
 * Created by SamZhao on 2017/7/24.
 */
public interface UserService {
    User checkUser(User user);

    User saveUser(User user);
}
