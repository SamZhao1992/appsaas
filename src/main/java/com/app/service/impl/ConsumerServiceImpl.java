package com.app.service.impl;

import com.app.entity.Consumer;
import com.app.service.ConsumerService;
import com.app.util.HttpRequestUtil;
import com.app.util.KongRequestUtil;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
@Transactional
@ConfigurationProperties(prefix = "kong")
public class ConsumerServiceImpl implements ConsumerService {

    Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);

    private String consumerurl;

    private String baseurl;

    /**
     * 创建消费者 并创建一个JWT凭据
     *
     * @param consumer
     * @return
     */
    @Override
    public Consumer createConsumer(Consumer consumer) throws Exception {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", consumer.getConsumerName());

        String str = HttpRequestUtil.doPost(consumerurl, params);
        logger.info("add consumer: " + str);
        JsonParser parse = new JsonParser();
        JsonObject json = (JsonObject) parse.parse(str);  //创建jsonObject对象
        consumer.setConsumerId(json.get("id").getAsString());

        str = HttpRequestUtil.doPost(consumerurl + consumer.getConsumerId() + "/jwt", new HashMap<String, Object>());
        logger.info("jwt consumer: " + str);
        json = (JsonObject) parse.parse(str);
        consumer.setConsumerId(json.get("id").getAsString());

        return consumer;
    }

    @Override
    public Consumer getConsumerByNameOrId(String appNameOrId) throws Exception {
        Consumer consumer = null;
        try{
            if (StringUtils.isNotEmpty(appNameOrId)) {
                String str = KongRequestUtil.doGetInfo(baseurl, "consumers", appNameOrId);
                JsonParser parse = new JsonParser();
                JsonObject json = (JsonObject) parse.parse(str);
                if(json.has("id")){
                    consumer = new Consumer();
                    consumer.setConsumerId(json.get("id").getAsString());
                    consumer.setConsumerName(json.get("username").getAsString());
                }
            }
        }catch (Exception e){
            throw new Exception("No consumer : " + appNameOrId);
        }
        return consumer;
    }

    public String getConsumerurl() {
        return consumerurl;
    }

    public void setConsumerurl(String consumerurl) {
        this.consumerurl = consumerurl;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }
}
