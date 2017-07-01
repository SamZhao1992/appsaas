package com.app.service.impl;

import com.app.entity.Consumer;
import com.app.entity.ConsumerExample;
import com.app.mapper.ConsumerMapper;
import com.app.service.ConsumerService;
import com.app.util.HttpRequestUtil;
import com.github.pagehelper.PageHelper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
@Transactional
public class ConsumerServiceImpl implements ConsumerService{
    Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);

    @Autowired
    private ConsumerMapper consumerMapper;

    @Override
    public Consumer getById(String id){
        PageHelper.startPage(1,1);
        return consumerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Consumer getConsumerByName(String appName) {
        ConsumerExample example = new ConsumerExample();
        ConsumerExample.Criteria criteria = example.createCriteria();
        criteria.andAppNameEqualTo(appName);
        List<Consumer> list = consumerMapper.selectByExample(example);
        if(list != null && list.size() > 0)
            return list.get(0);
        else
            return null;
    }

    /**
     * 创建消费者 并创建一个JWT凭据
     * @param consumer
     * @return
     */
    @Override
    public Consumer createConsumer(Consumer consumer) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", consumer.getUsername());

        String str = HttpRequestUtil.doPost("http://10.0.254.21:8001/consumers", params);
        JsonParser parse =new JsonParser();
        JsonObject json=(JsonObject) parse.parse(str);  //创建jsonObject对象
        consumer.setId(json.get("id").getAsString());
        consumer.setCreatedAt(json.get("created_at").getAsString());

        str = HttpRequestUtil.doPost("http://10.0.254.21:8001/consumers/"+consumer.getId()+"/jwt", new HashMap<String, Object>());
        json=(JsonObject) parse.parse(str);
        consumer.setSecret(json.get("secret").getAsString());
        consumer.setKeyConsumer(json.get("key").getAsString());
        consumer.setConsumerId(json.get("consumer_id").getAsString());

        consumerMapper.insert(consumer);
        return consumer;
    }



}
