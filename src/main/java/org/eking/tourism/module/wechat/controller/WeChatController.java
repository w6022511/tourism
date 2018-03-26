package org.eking.tourism.module.wechat.controller;

import org.eking.tourism.module.wechat.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* 验证公众号url配置
* @Author wangyu
* @Date 2018/3/20
*/
@RestController
public class WeChatController {

    @Autowired
    private WeChatService weChatService;

    /**
    * 校验signature，必须使用Get请求
    * @Author wangyu
    * @Date 2018/3/18
    */
    @GetMapping("")
    public String checkSignature(HttpServletRequest request){

        return weChatService.checkSignature(request);

    }

    /**
    * Post请求，用来处理消息的接收与回复
    * @Author wangyu
    * @Date 2018/3/18
    */
    @PostMapping("")
    public String doPost(HttpServletRequest request){

        return weChatService.doPost(request);

    }
}
