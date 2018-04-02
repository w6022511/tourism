package org.eking.tourism.common.interceptor;

import org.eking.tourism.common.constant.WeChatAPIConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLEncoder;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Value("${wechat.domain}")
    private String domain;

    @Value("${wechat.AppID}")
    private String APPID;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        DoAuth doAuth = method.getAnnotation(DoAuth.class);
        //有注解则拦截
        if (doAuth != null){
            logger.info("requestUrl-----------"+ request.getRequestURL().toString());

            //将请求URL存到session,完成授权后可直接跳转
            request.getSession().setAttribute("requestUrl",request.getRequestURL().toString());
            logger.info("刚存上"+request.getSession().getAttribute("requestUrl").toString());

            //从seession中获取openid，如果存在说明已经授权
            String openId = (String) request.getSession().getAttribute("openId");
            logger.info("a--------------------"+openId);
            System.err.println(request.getSession().getAttribute("requestUrl").toString());

            if (openId == null || openId.equals("")) {

                String url = WeChatAPIConstant.USER_AUTHORIZE_URL;

                String backUrl = domain + "/callBack";

                String scope = "snsapi_userinfo";

                String newUrl = url.replace("APPID", APPID)
                        .replace("REDIRECT_URI", URLEncoder.encode(backUrl))//回调地址，必须能在公网访问
                        .replace("SCOPE", scope);
                try {
                    System.err.println(newUrl);
                    response.sendRedirect(newUrl);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

}
