package com.app;

import com.app.util.HttpRequestUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SamZhao on 2017/7/3.
 */
public class TestClass {
    public static void main(String[] args){
        String result = "http://10.0.254.21:8001/consumers/3c85650c-66bd-480c-8c62-77c9bf9d8bc4";
        try {
            result = HttpRequestUtil.doGet(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);

        //添加构成JWT的参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("typ", "JWT");
        map.put("alg", "HS256");
//        JwtBuilder builder = Jwts.builder().setHeaderParams(map).claim("iss", "4e58b2e033dd4be494d0584da8d78297");
//        System.out.print(builder.compact());


        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            String token = JWT.create()
                    .withHeader(map)
                    .withClaim("iss", "ed4e3a3f3a11477a9d22071ff730c86c")
                    .sign(algorithm);
            System.out.println(token);
        } catch (UnsupportedEncodingException exception){
            //UTF-8 encoding not supported
        } catch (JWTCreationException exception){
            //Invalid Signing configuration / Couldn't convert Claims.
        }
    }
}
