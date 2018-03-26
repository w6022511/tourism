package org.eking.tourism.module.wechat.entity;

public class BaseMessage {

    protected String ToUserName;//接收方账号
    protected String FromUserName;//发送方帐号
    protected long CreateTime;//消息创建时间
    protected String MsgType;//消息类型，详情见MsgTypeConstant类

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}
