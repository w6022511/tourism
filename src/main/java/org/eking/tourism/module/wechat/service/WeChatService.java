package org.eking.tourism.module.wechat.service;

import org.eking.tourism.common.constant.MsgTypeConstant;
import org.eking.tourism.common.utils.CheckUtil;
import org.eking.tourism.common.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Service
public class WeChatService {

    @Autowired
    private CheckUtil checkUtil;

    @Autowired
    private MessageUtil messageUtil;

    public String checkSignature(HttpServletRequest request){
        System.out.println("success");
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        //校验成功，原样返回echostr参数内容，接入生效
        if(checkUtil.checkSignature(signature,timestamp,nonce)){
            return echostr;
        }

        return null;
    }

    /**
     *
     * 处理消息
     *@param
     *@return
     *
     */
    public String doPost(HttpServletRequest request){
        Map<String,String> map = messageUtil.xmlToMap(request);
        String toUserName = map.get("ToUserName");
        String fromUserName = map.get("FromUserName");
        String msgType = map.get("MsgType");
        String content = map.get("Content");

        String message = null;
        if(MsgTypeConstant.MESSAGE_TEXT.equals(msgType)){

            //message = messageUtil.initMessage(fromUserName,toUserName,"你发送的消息是："+content);
            message = messageUtil.initMessageNews(fromUserName,toUserName);

        }else if(MsgTypeConstant.MESSAGE_EVENT.equals(msgType)){
            String eventType = map.get("Event");

            if (MsgTypeConstant.MESSAGE_SUBSCRIBE.equals(eventType)){//关注事件
                message = messageUtil.initMessage(fromUserName,toUserName,messageUtil.subscribeMessage());
            }else if(MsgTypeConstant.MESSAGE_CLICK.equals(eventType)){
                //return null;
            }
        }else if(MsgTypeConstant.MESSAGE_VOICE.equals(msgType)){
            if (map.get("Recognition").equals("购票。")){
                message = messageUtil.initMessageNews(fromUserName,toUserName);
            }else{
                message = messageUtil.initMessage(fromUserName,toUserName,"你说的是："+ map.get("Recognition"));
            }

        }
        System.err.println(message);
        return message;
    }
}
