package org.eking.tourism;

import org.eking.tourism.common.utils.CommonUtil;
import org.eking.tourism.common.utils.WeChatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;
import java.util.Map;
import java.util.HashMap;
import java.util.Formatter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;  

@RestController
class Sign {

    @Autowired
    private WeChatUtil weChatUtil;

    @GetMapping("/ign")
    public Map sign(HttpServletRequest request){
        long timestamp = CommonUtil.getSysCurrentTimeSec();
        String noncestr = UUID.randomUUID().toString();
        String accessToken = weChatUtil.getAccessToken().getAccess_token();
        String jsApiTicket = weChatUtil.getJSApiTicket(accessToken);
        //特别注意的是调用微信js，url必须是当前页面(转发的不行)
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

}
