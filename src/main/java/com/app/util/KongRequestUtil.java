package com.app.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SamZhao on 2017/7/3.
 */
public class KongRequestUtil {

    /**
     * 从 Kong中获取信息
     * @param baseUrl
     * @param type
     * @param nameOrId
     * @return
     */
    public static String doGetInfo(String baseUrl, String type, String nameOrId){
        String result = baseUrl + "/" + type + "/" + nameOrId;
        result = HttpRequestUtil.doGet(result);
        return result;
    }

    /**
     *  JWT Token 生成
     * @param key
     * @return
     */
    public static String getJWT(String key){
        String token = null;
        //添加构成JWT的参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("typ", "JWT");
        map.put("alg", "HS256");
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            token = JWT.create()
                    .withHeader(map)
                    .withClaim("iss", key)
                    .sign(algorithm);
            System.out.println(token);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return token;
    }



}
