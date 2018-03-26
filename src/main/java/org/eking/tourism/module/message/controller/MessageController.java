package org.eking.tourism.module.message.controller;

import org.eking.tourism.common.common.ServiceResult;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

@RestController
public class MessageController {

    @GetMapping("/greeting")
    public ServiceResult test(ModelAndView mv) {

        ServiceResult result = new ServiceResult();
        int a=(int) Math.round(Math.random());
        System.err.println(a);
        result.setMessage(String.valueOf(a));
//        mv.setViewName("greeting");
//        mv.addObject("title","欢迎使用Thymeleaf!");
        return result;
    }
    @GetMapping("/index")
    public ModelAndView index(){

        return new ModelAndView("index");
    }
}
