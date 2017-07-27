package com.app.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by SamZhao on 2017/7/24.
 */
public class MD5Utils {

    /**利用MD5进行加密
     * @param str  待加密的字符串
     * @return  加密后的字符串
     * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
     * @throws UnsupportedEncodingException
     */
    public static String EncoderByMd5(String str){
        String newstr = null;
        try {

            //确定计算方法
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newstr;
    }

    public static void main(String[] args){
        String str = "123";
        String id= UUID.randomUUID().toString();
        System.out.println(id);
        for(int i=0;i<100;i++){
            System.out.println(MD5Utils.EncoderByMd5(str));
        }
    }

}
