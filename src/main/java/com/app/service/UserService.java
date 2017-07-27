package com.app.service;

import com.app.entity.KongUser;

/**
 * Created by SamZhao on 2017/7/24.
 */
public interface UserService {
    KongUser loginUser(KongUser user);

    int saveUser(KongUser user);

    int updateUser(KongUser user);

    int checkUser(KongUser user);
}
