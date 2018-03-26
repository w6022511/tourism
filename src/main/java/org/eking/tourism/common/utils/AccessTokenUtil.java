package org.eking.tourism.common.utils;

import net.sf.json.JSONObject;
import org.eking.tourism.common.constant.WeChatAPIConstant;
import org.eking.tourism.common.wechatentities.AccessToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccessTokenUtil{

    @Value("${wechat.AppID}")
    String APPID;

    @Value("${wechat.AppSecret}")
    String APPSECRET;

    /**
    *
    *获取token
    *@param
    *@return
    *
    */
    public AccessToken getAccessToken(){
        AccessToken token = new AccessToken();
        String url = WeChatAPIConstant.ACCESS_TOKEN_URL.replace("APPID",APPID).replace("APPSECRET",APPSECRET);

        JSONObject jsonObject = HttpUtil.doGet(url);

        if(jsonObject != null){
            token.setAccess_token(jsonObject.getString("access_token"));
            token.setExpires_in(jsonObject.getInt("expires_in"));
        }

        return token;
    }
}
