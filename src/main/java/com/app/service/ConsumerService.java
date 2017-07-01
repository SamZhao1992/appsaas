package com.app.service;

import com.app.entity.Consumer;

/**
 * Created by SamZhao on 2017/7/1.
 */
public interface ConsumerService {
    Consumer getById(String id);

    Consumer getConsumerByName(String appName);

    Consumer createConsumer(Consumer consumer);
}
