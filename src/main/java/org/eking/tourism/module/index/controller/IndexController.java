package org.eking.tourism.module.index.controller;

import net.sf.json.JSONObject;
import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.interceptor.DoAuth;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("/greeting")
    public ServiceResult test(ModelAndView mv) {

        ServiceResult result = new ServiceResult();
        int a=(int) Math.round(Math.random());
        result.setMessage(String.valueOf(a));
        return result;
    }

    @GetMapping("/index")
    public String index(){

        return "index";
    }

    @GetMapping("/qrCode")
    public String qrCode(){

        return "qrCode";
    }


    @DoAuth
    @GetMapping("/order")
    public String order(){

        return "order";
    }

    @DoAuth
    @GetMapping("/orderList")
    public String orderList(){

        return "orderList";
    }

    @GetMapping("/orderInfo")
    public String orderInfo(HttpServletRequest request, Model model){
        String orderId = request.getParameter("orderId");

        model.addAttribute("orderId",orderId);
        return "orderInfo";
    }

    @GetMapping("/userPicture")
    public String userPicture(){

        return "userPicture";
    }

    @GetMapping("/test")
    public ModelAndView demo(){
        return new ModelAndView("demo");
    }
    @GetMapping("/index1")
    public String index1(){
        return "aaa/index";
    }

}
