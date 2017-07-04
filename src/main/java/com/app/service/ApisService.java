package com.app.service;

import com.app.entity.Apis;
import com.app.entity.Consumer;

/**
 * Created by SamZhao on 2017/7/1.
 */
public interface ApisService {

    int setRalate(Consumer consumer, Apis apis) throws Exception;

    String getRalate(Consumer consumer, Apis apis);

    Apis getApiByNameOrId(String targetMethod) throws Exception;

    String getResult(Consumer consumer, Apis apis, String params, String apikey) throws Exception;
}
