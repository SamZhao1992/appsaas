package com.app.service.impl;

import com.app.entity.Apis;
import com.app.mapper.ApisMapper;
import com.app.service.ApisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
public class ApisServiceImpl implements ApisService {

    @Autowired
    private ApisMapper apisMapper;

    @Override
    public Apis findById(String id) {
        return apisMapper.selectByPrimaryKey(id);
    }
}
