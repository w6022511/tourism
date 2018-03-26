package org.eking.tourism.common.utils;


import com.fasterxml.jackson.databind.util.JSONPObject;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
* http工具类
* @Author wangyu
* @Date 2018/3/15 
*/  
public class HttpUtil {


    /**
    *
    *处理GET请求
    *@param
    *@return
    *
    */
    public static JSONObject doGet(String url){
        JSONObject jsonObject = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        try {
            CloseableHttpResponse response = httpclient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if(entity!=null){

                String result = EntityUtils.toString(entity);
                //String result =  new String(EntityUtils.toString(entity).getBytes("UTF-8"),"ISO-8859-1");
                jsonObject = JSONObject.fromObject(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    /**
    *
    *处理Post请求
    *@param 
    *@return
    *
    */
    public static JSONObject doPost(String url,String outStr){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        JSONObject jsonObject = null;
        try {
            httpPost.setEntity(new StringEntity(outStr, "utf-8"));

            CloseableHttpResponse response = httpclient.execute(httpPost);
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            jsonObject =JSONObject.fromObject(result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return jsonObject;
    }


}
