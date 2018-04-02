package org.eking.tourism.common.config;


import org.eking.tourism.common.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
        //registration.excludePathPatterns("/error","/logout");

    }
}
