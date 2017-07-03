package com.app.service.impl;

import com.app.entity.Apis;
import com.app.entity.Consumer;
import com.app.entity.RecordTec;
import com.app.entity.RecordTecExample;
import com.app.mapper.RecordTecMapper;
import com.app.service.ApisService;
import com.app.util.HttpRequestUtil;
import com.app.util.KongRequestUtil;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SamZhao on 2017/7/1.
 */
@Service
@ConfigurationProperties(prefix = "kong")
public class ApisServiceImpl implements ApisService {

    private String baseurl;

    @Autowired
    private RecordTecMapper recordTecMapper;

    @Override
    public Apis getApiByNameOrId(String targetMethod) {
        Apis apis = null;
        if (StringUtils.isNotEmpty(targetMethod)) {
            String str = KongRequestUtil.doGetInfo(baseurl, "apis", targetMethod);
            JsonParser parse = new JsonParser();
            JsonObject json = (JsonObject) parse.parse(str);
            if (json.has("id")) {
                apis = new Apis();
                apis.setUpstreamUrl(json.get("upstream_url").getAsString());
                apis.setId(json.get("id").getAsString());
                apis.setUris(json.get("uris").getAsString());
            }
        }
        return apis;
    }

    @Override
    public String setRalate(Consumer consumer, Apis apis) {
        RecordTecExample example = new RecordTecExample();
        RecordTecExample.Criteria criteria = example.createCriteria();
        criteria.andApiIdEqualTo(apis.getId());
        criteria.andConsumerIdEqualTo(consumer.getConsumerId());
        String result = null;
        List<RecordTec> list = recordTecMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            if ("0".equals(list.get(0).getIsDelete()) && "0".equals(list.get(0).getIsActive())) {
                String url = "http://kong:8001/consumers/" + consumer.getConsumerId() + "/key-auth";
                Map<String, Object> map = new HashMap<String, Object>();
                result = HttpRequestUtil.doPost(url, map);

                RecordTec recordTec = new RecordTec();
                recordTec.setApiId(apis.getId());
                recordTec.setApiName(apis.getUris());
                recordTec.setConsumerId(consumer.getConsumerId());
                recordTec.setConsumerName(consumer.getAppName());
                recordTec.setIsActive("0");
                recordTec.setIsDelete("0");
                recordTec.setKeyAccess(result);

                recordTecMapper.insert(recordTec);
            }
        }
        return result;
    }

    @Override
    public String getRalate(Consumer consumer, Apis apis) {
        RecordTecExample example = new RecordTecExample();
        RecordTecExample.Criteria criteria = example.createCriteria();
        criteria.andApiIdEqualTo(apis.getId());
        criteria.andConsumerIdEqualTo(consumer.getConsumerId());
        String result = null;
        List<RecordTec> list = recordTecMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            result = list.get(0).getKeyAccess();
        }
        return result;
    }

    @Override
    public String getResult(Consumer consumer, Apis apis, String params, String apikey) {
        String url = "http://10.0.254.21:8000";
        url = url + "?apikey=" + apikey;
        if (StringUtils.isNotEmpty(params))
            url = url + "&" + params;
        String result = HttpRequestUtil.doGet(url);
        return result;
    }

}
