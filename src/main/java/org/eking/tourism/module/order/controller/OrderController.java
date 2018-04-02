package org.eking.tourism.module.order.controller;

import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.common.ServiceResultGenerator;
import org.eking.tourism.common.interceptor.DoAuth;
import org.eking.tourism.common.utils.MessageUtil;
import org.eking.tourism.common.utils.RegexUtils;
import org.eking.tourism.module.accesslog.service.AccessLogService;
import org.eking.tourism.module.order.service.OrderService;
import org.eking.tourism.module.realuser.RealUserService;
import org.eking.tourism.module.wechat.service.WeChatService;
import org.eking.tourism.repository.entity.Order;
import org.eking.tourism.repository.entity.OrderShowVo;
import org.eking.tourism.repository.entity.RealUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
* 订单入口
* @Author wangyu
* @Date 2018/3/22
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class OrderController {

    @Autowired
    private RealUserService realUserService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private AccessLogService accessLogService;

    @Autowired
    private MessageUtil messageUtil;

    /**
    *
    *下单
    *@param
    *@return
    *
    */
    @PostMapping("/createOrder")
    public ServiceResult createOrder(@RequestBody OrderShowVo orderShowVo){
        ServiceResult result = new ServiceResult();
        if(!RegexUtils.isIdCard(orderShowVo.getPapersNumber())){
            return ServiceResultGenerator.genErrorResult("身份证号不合法");
        }

        //1.创建实际游客信息，并获取id,将id填入订单信息
        RealUser realUser = new RealUser(orderShowVo.getName(),orderShowVo.getPapersNumber(),orderShowVo.getFacePhotoPath(),orderShowVo.getMobilePhoneNumber(),orderShowVo.getOpenId());
        int realUserId  = realUserService.createRealUser(realUser);

        //2.创建订单信息
        Order order =new Order();
        order.setRealUserId(realUserId);
        order.setTicketCount(orderShowVo.getTicketCount());
        order.setTicketName(orderShowVo.getTicketName());
        order.setOpenId(orderShowVo.getOpenId());
        if (orderService.createOrder(order) !=0){
            //3.创建访问记录信息,
            accessLogService.insert(order.getId(),realUserId);

            return ServiceResultGenerator.genSuccessResult();
        }else {
            return ServiceResultGenerator.genErrorResult("下单失败，请重试");
        }
    }

    /**
    *
    *获取订单列表
    *@param 
    *@return
    *
    */
    @PostMapping("/orderPage")
    public ServiceResult page(@RequestBody(required = false) Order order){
        List<OrderShowVo> list = new ArrayList<>();

        if (order == null){//无传参时，默认展示所有已确认订单

            list = orderService.page();
        }else {
            list = orderService.page(order);
        }
        return ServiceResultGenerator.genSuccessResult(list);
    }

    /**
    *
    *通过id获取订单信息
    *@param
    *@return
    *
    */
    @GetMapping("/getOrderById/{id}")
    public ServiceResult getOrderById(@PathVariable("id") Integer id){
        System.err.println();
        return ServiceResultGenerator.genSuccessResult(orderService.getOrderById(id));
    }

}
