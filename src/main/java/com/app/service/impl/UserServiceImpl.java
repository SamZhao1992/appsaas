package com.app.service.impl;

import com.app.entity.KongUser;
import com.app.entity.KongUserExample;
import com.app.mapper.KongUserMapper;
import com.app.service.UserService;
import com.app.util.MD5Utils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private KongUserMapper kongUserMapper;

    /**
     * 检查用户是否存在
     * @param user
     * @return
     */
    @Override
    public KongUser loginUser(KongUser user) {
        //查询对应登录用户信息
        KongUser result = null ;
        if(StringUtils.isNotEmpty(user.getName()) && StringUtils.isNotEmpty(user.getPassword())){
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", user.getName());
            //密码MD5加密
            map.put("password", MD5Utils.EncoderByMd5(user.getPassword()));
            List<KongUser> users = kongUserMapper.loginUser(map);
            if(users != null && users.size() > 0){
                result = users.get(0);
                //记录最后一次登录信息
                result.setLastLogin(new Date());
                kongUserMapper.updateByPrimaryKeySelective(result);
            }
        }
        return result;
    }

    /**
     * 注册新用户
     * @param user
     * @return
     */
    @Override
    public int saveUser(KongUser user) {
        user.setCreatedAt(new Date());
        user.setIsUse("1");
        user.setPassword(MD5Utils.EncoderByMd5(user.getPassword()));
        user.setRoleType("0");
        user.setId(UUID.randomUUID().toString());
        int i = kongUserMapper.insert(user);
        return i;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public int updateUser(KongUser user) {
        return 0;
    }

    /**
     * 校验用户名是否重复
     *
     * @param user
     * @return
     */
    @Override
    public int checkUser(KongUser user) {
        //查询对应登录用户信息
        KongUserExample userExample = new KongUserExample();
        KongUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNameEqualTo(user.getName().trim());
        return kongUserMapper.countByExample(userExample);
    }
}
