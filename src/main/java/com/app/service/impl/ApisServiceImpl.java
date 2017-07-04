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

    private String requrl;
    private String baseurl;

    @Autowired
    private RecordTecMapper recordTecMapper;

    /**
     * 获取Kong中的API信息
     * @param targetMethod
     * @return
     * @throws Exception
     */
    @Override
    public Apis getApiByNameOrId(String targetMethod) throws Exception {
        Apis apis = null;
        try{
            if (StringUtils.isNotEmpty(targetMethod)) {
                String str = KongRequestUtil.doGetInfo(baseurl, "apis", targetMethod);
                JsonParser parse = new JsonParser();
                JsonObject json = (JsonObject) parse.parse(str);
                if (json.has("id")) {
                    apis = new Apis();
                    apis.setApiId(json.get("id").getAsString());
                    apis.setUris(json.get("uris").getAsString());
                    apis.setApiName(json.get("name").getAsString());
                    apis.setUpstreamUrl(json.get("upstream_url").getAsString());
                }
            }
        }catch (Exception e){
            throw new Exception("No api : " + targetMethod);
        }
        return apis;
    }

    /**
     * 设置绑定关系
     * @param consumer
     * @param apis
     * @return
     */
    @Override
    public int setRalate(Consumer consumer, Apis apis) throws Exception {
        int flag = 0;
        String result = null;
        String url = "http://kong:8001/consumers/" + consumer.getConsumerId() + "/key-auth";
        Map<String, Object> map = new HashMap<String, Object>();
        result = HttpRequestUtil.doPost(url, map);

        JsonParser parse = new JsonParser();
        JsonObject json = (JsonObject) parse.parse(result);
        String key = json.get("key").getAsString();

        RecordTec recordTec = new RecordTec();
        recordTec.setApiId(apis.getApiId());
        recordTec.setApiName(apis.getUris());
        recordTec.setConsumerId(consumer.getConsumerId());
        recordTec.setConsumerName(consumer.getConsumerName());
        recordTec.setIsActive("0");
        recordTec.setIsDelete("0");
        recordTec.setKeyAccess(key);

        RecordTecExample example = new RecordTecExample();
        RecordTecExample.Criteria criteria = example.createCriteria();
        criteria.andApiIdEqualTo(apis.getApiId());
        criteria.andConsumerIdEqualTo(consumer.getConsumerId());
        List<RecordTec> list = recordTecMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            if ("0".equals(list.get(0).getIsDelete()) && "0".equals(list.get(0).getIsActive())) {
                recordTec.setId(list.get(0).getId());
                flag = recordTecMapper.updateByPrimaryKeySelective(recordTec);
            }
        }else{
            flag = recordTecMapper.insert(recordTec);
        }
        return flag;
    }

    /**
     * 获得绑定关系 防止多重权限访问
     * @param consumer
     * @param apis
     * @return
     */
    @Override
    public String getRalate(Consumer consumer, Apis apis) {
        RecordTecExample example = new RecordTecExample();
        RecordTecExample.Criteria criteria = example.createCriteria();
        criteria.andApiIdEqualTo(apis.getApiId());
        criteria.andConsumerIdEqualTo(consumer.getConsumerId());
        String result = null;
        List<RecordTec> list = recordTecMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            result = list.get(0).getKeyAccess();
        }
        return result;
    }

    /**
     * 向Kong发起请求
     * @param consumer
     * @param apis
     * @param params
     * @param apikey
     * @return
     * @throws Exception
     */
    @Override
    public String getResult(Consumer consumer, Apis apis, String params, String apikey) throws Exception {
        String url = requrl + apis.getUris() + "?apikey=" + apikey;
        if (StringUtils.isNotEmpty(params))
            url = url + "&" + params;
        Map<String, Object> map = new HashMap<String, Object>();
        String result = HttpRequestUtil.doGet(url, map);
        return result;
    }

    public String getRequrl() {
        return requrl;
    }

    public void setRequrl(String requrl) {
        this.requrl = requrl;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }
}
