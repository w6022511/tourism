package org.eking.tourism.module.wechat.entity;

/**
* 链接消息
* @Author wangyu
* @Date 2018/3/21
*/
public class MessageLink extends BaseMessage {

    private String Title;//标题

    private String Description;//消息描述

    private String Url;//消息链接

    private String MsgId;//消息id

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
