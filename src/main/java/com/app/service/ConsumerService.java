package com.app.service;

import com.app.entity.Consumer;

/**
 * Created by SamZhao on 2017/7/1.
 */
public interface ConsumerService {
    Consumer createConsumer(Consumer consumer) throws Exception;

    Consumer getConsumerByNameOrId(String appNameOrId) throws Exception;
}
