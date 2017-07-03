package com.app.service;

import com.app.entity.Apis;
import com.app.entity.Consumer;

/**
 * Created by SamZhao on 2017/7/1.
 */
public interface ApisService {

    String setRalate(Consumer consumer, Apis apis);

    String getRalate(Consumer consumer, Apis apis);

    Apis getApiByNameOrId(String targetMethod);

    String getResult(Consumer consumer, Apis apis, String params, String apikey);
}
