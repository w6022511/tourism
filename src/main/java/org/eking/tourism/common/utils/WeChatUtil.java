package org.eking.tourism.common.utils;

import net.sf.json.JSONObject;
import org.eking.tourism.common.constant.WeChatAPIConstant;
import org.eking.tourism.common.wechatentities.AccessToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;

@Component
public class WeChatUtil {

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
        //System.err.println(url);
        JSONObject jsonObject = HttpUtil.doGet(url);

        if(jsonObject != null){
            token.setAccess_token(jsonObject.getString("access_token"));
            token.setExpires_in(jsonObject.getInt("expires_in"));
        }

        return token;
    }

    /**
    *
    *获取openID
    *@param
    *@return
    *
    */
    public String getOpenid(String code) {

        String url = WeChatAPIConstant.LOGIN_ACCESS_TOKEN_URL.replace("APPID",APPID)
                .replace("SECRET",APPSECRET)
                .replace("CODE",code);

        JSONObject jsonObject = HttpUtil.doGet(url);

        return jsonObject.getString("openid");
    }

    public String getJSApiTicket(String accessToken) {

        String url = WeChatAPIConstant.JS_API_TICKET.replace("ACCESS_TOKEN",accessToken);
        JSONObject jsonObject = HttpUtil.doGet(url);
        return jsonObject.getString("ticket");
    }

    /**
     *
     *sha1加密
     *@param
     *@return
     *
     */
    public static String getSha1(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    /**
     * 获取媒体文件
     *
     * @param mediaId
     *      媒体文件id
     * */
    public String downloadMedia(String mediaId) {

        String filePath = null;
        String savePath = Class.class.getClass().getResource("/").getPath();

        String requestUrl = WeChatAPIConstant.GET_MEDIA.replace("MEDIA_ID",mediaId)
                .replace("ACCESS_TOKEN",getAccessToken().getAccess_token());
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setRequestMethod("GET");

            if (!savePath.endsWith("/")) {
                savePath += "/";
            }
            // 根据内容类型获取扩展名
            String fileExt = getFileexpandedName(conn.getHeaderField("Content-Type"));
            // 将mediaId作为文件名
            filePath = savePath + mediaId + fileExt;
            BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
            FileOutputStream fos = new FileOutputStream(new File(filePath));
            byte[] buf = new byte[8096];
            int size = 0;
            while ((size = bis.read(buf)) != -1)
                fos.write(buf, 0, size);
            fos.close();
            bis.close();

            conn.disconnect();
            String info = String.format("下载媒体文件成功，filePath=" + filePath);
            System.out.println(info);
        } catch (Exception e) {
            filePath = null;
            String error = String.format("下载媒体文件失败：%s", e);
            System.out.println(error);
        }
        return filePath;
    }
    /**
     * 根据内容类型判断文件扩展名
     *
     * @param contentType 内容类型
     * @return
     */
    public static String getFileexpandedName(String contentType) {
        String fileEndWitsh = "";
        if ("image/jpeg".equals(contentType))
            fileEndWitsh = ".jpg";
        else if ("audio/mpeg".equals(contentType))
            fileEndWitsh = ".mp3";
        else if ("audio/amr".equals(contentType))
            fileEndWitsh = ".amr";
        else if ("video/mp4".equals(contentType))
            fileEndWitsh = ".mp4";
        else if ("video/mpeg4".equals(contentType))
            fileEndWitsh = ".mp4";
        return fileEndWitsh;
    }
}
