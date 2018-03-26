package org.eking.tourism.common.utils;

import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.eking.tourism.common.constant.MsgTypeConstant;
import org.eking.tourism.module.wechat.entity.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
* 消息处理工具类
* @Author wangyu
* @Date 2018/3/14
*/
public class MessageUtil {

    /**
    *
    *将微信的xml参数转化成map
    *@param
    *@return
    *
    */
    public static Map<String,String> xmlToMap(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        SAXReader reader = new SAXReader();
        InputStream in = null;
        try {
            //request中获取输入流
            in =request.getInputStream();
            Document doc = reader.read(in);
            //获取xml的根元素
            Element root = doc.getRootElement();
            List<Element> list = root.elements();
            for (Element element:list){
                map.put(element.getName(),element.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
    *
    *将文本转化为xml
    *@param
    *@return
    *
    */
    public static String textToXml(MessageText text){

        XStream xStream = new XStream();
        xStream.alias("xml",text.getClass());
        return xStream.toXML(text);
    }

    public static String initMessage(String fromUserName, String toUserName,String content) {
        MessageText text = new MessageText();
        text.setToUserName(fromUserName);
        text.setFromUserName(toUserName);
        text.setContent(content);
        text.setCreateTime(new Date().getTime());
        text.setMsgType(MsgTypeConstant.MESSAGE_TEXT);
        return  textToXml(text);
    }

    public static String subscribeMessage(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("欢迎关注！\n");
        stringBuffer.append("可使用语音回复'购票'获取门票信息");
        return stringBuffer.toString();
    }

    /**
    *
    *图文消息转为xml
    *@param
    *@return
    *
    */
    public static String newsToXml(MessageNews messageNews){

        XStream xStream = new XStream();
        xStream.alias("xml",messageNews.getClass());
        xStream.alias("item", new News().getClass());
        return xStream.toXML(messageNews);
    }

    /**
    * 语音消息转xml
    * @Author wangyu
    * @Date 2018/3/20
    */
    public static String newsToXml(MessageVoice messageVoice){

        XStream xStream = new XStream();
        xStream.alias("xml",messageVoice.getClass());
        return xStream.toXML(messageVoice);
    }

    /* 链接消息转xml
     * @Author wangyu
     * @Date 2018/3/21
     */
    public static String linkToXml(MessageLink messageLink){

        XStream xStream = new XStream();
        xStream.alias("xml",messageLink.getClass());
        return xStream.toXML(messageLink);
    }

    public static String initMessageNews(String fromUserName, String toUserName) {
        String message = null;
        List<News> newsList = new ArrayList<>();
        MessageNews messageNews =new MessageNews();

        News news = new News();
        news.setTitle("电影公社成人票【含1942民国街+南洋街】");
        news.setPicUrl("file:///C:/Users/w6022/Pictures/Camera%20Roll/CkZeblql9vHAsylQAADSTXg_Upc427.jpg");
        news.setUrl("http://www.eking-tech.com/");
        news.setDescription("nihaoa");

        News news1 = new News();
        news1.setTitle("【海南】海口电影公社通票");
        news1.setPicUrl("file:///C:/Users/w6022/Pictures/Camera%20Roll/CkZeblql9vHAsylQAADSTXg_Upc427.jpg");
        news1.setUrl("https://weibo.com/hnagroup");
        news1.setDescription("nihaoa");

        News news2 = new News();
        news2.setTitle("【海南】海口电影公社通票 -限海南本地居民使用");
        news2.setPicUrl("file:///C:/Users/w6022/Pictures/Camera%20Roll/CkZeblql9vHAsylQAADSTXg_Upc427.jpg");
        news2.setUrl("http://www.hnagroup.com/en-us/");
        news2.setDescription("nihaoa");

        newsList.add(news);
        newsList.add(news1);
        newsList.add(news2);

        messageNews.setToUserName(fromUserName);
        messageNews.setFromUserName(toUserName);
        messageNews.setCreateTime(new Date().getTime());
        messageNews.setMsgType(MsgTypeConstant.MESSAGE_NEWS);
        messageNews.setArticles(newsList);
        messageNews.setArticleCount(newsList.size());

        message = newsToXml(messageNews);

        return  message;
    }

}
