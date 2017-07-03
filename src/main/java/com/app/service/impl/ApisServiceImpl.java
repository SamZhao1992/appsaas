package com.app.service.impl;

import com.app.entity.Apis;
import com.app.service.ApisService;
import com.app.util.KongRequestUtil;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
@ConfigurationProperties(prefix = "kong")
public class ApisServiceImpl implements ApisService {

    private String baseurl;

    @Override
    public Apis getApiByNameOrId(String targetMethod) {
        if (StringUtils.isNotEmpty(targetMethod)) {
            String str = KongRequestUtil.doGetInfo(baseurl, "apis", targetMethod);
            JsonParser parse = new JsonParser();
            JsonObject json = (JsonObject) parse.parse(str);
            if(json.has("id")){

                return null;
            }else {
                return null;
            }

        } else {
            return null;
        }
    }
}
