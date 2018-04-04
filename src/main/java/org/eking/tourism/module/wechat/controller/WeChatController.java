package org.eking.tourism.module.wechat.controller;

import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.common.ServiceResultGenerator;
import org.eking.tourism.common.utils.CommonUtil;
import org.eking.tourism.common.utils.WeChatUtil;
import org.eking.tourism.module.wechat.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
* 验证公众号url配置
* @Author wangyu
* @Date 2018/3/20
*/
@RestController
public class WeChatController {

    @Autowired
    private WeChatService weChatService;

    @Autowired
    private WeChatUtil weChatUtil;


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

    /**
    *
    *微信js-sdk签名校验
    *@param
    *@return
    *
    */
    @GetMapping("/sign")
    public Map sign(HttpServletRequest request){
        long timestamp = CommonUtil.getSysCurrentTimeSec();
        String noncestr = UUID.randomUUID().toString();
        String accessToken = weChatUtil.getAccessToken().getAccess_token();
        String jsApiTicket = weChatUtil.getJSApiTicket(accessToken);

        /*1.特别注意的是调用微信js，url必须是当前页面(转发的不行)
        2.根据字段名排序
        */

        String str = "jsapi_ticket="+jsApiTicket+"&noncestr="+noncestr+"&timestamp="+timestamp+"&url="+request.getHeader("referer");
        String signature = weChatUtil.getSha1(str);
        System.err.println(request.getHeader("referer"));
        Map map = new HashMap();
        map.put("timestamp", timestamp);
        map.put("nonceStr", noncestr);
        map.put("signature", signature);
        map.put("accessToken", accessToken);
        map.put("jsapi_ticket", jsApiTicket);
        return map;
    }

    @GetMapping("/getMedia")
    public ServiceResult getMedia(HttpServletRequest req){
        ServiceResult result =new ServiceResult();
        String mediaId = req.getParameter("mediaId");
        try {
            return ServiceResultGenerator.genSuccessResult(weChatUtil.downloadMedia(mediaId));
        } catch (Exception e) {
            String error = String.format("下载媒体文件失败：%s", e);
            return ServiceResultGenerator.genErrorResult(error);
        }
    }

}
