package org.eking.tourism.module.wechat.entity;

/**
* 语音消息类
* @Author wangyu
* @Date 2018/3/21
*/
public class MessageVoice extends BaseMessage {

    private String MediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据

    private String Format;//语音格式，如amr，speex等

    private String MsgID;//消息id，64位整型

    private String Recognition;//语音识别结果，UTF8编码


    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getMsgID() {
        return MsgID;
    }

    public void setMsgID(String msgID) {
        MsgID = msgID;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }
}
