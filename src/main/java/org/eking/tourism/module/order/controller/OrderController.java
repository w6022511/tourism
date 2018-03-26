package org.eking.tourism.module.order.controller;

import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.common.ServiceResultGenerator;
import org.eking.tourism.module.accesslog.service.AccessLogService;
import org.eking.tourism.module.order.service.OrderService;
import org.eking.tourism.module.realuser.RealUserService;
import org.eking.tourism.repository.entity.Order;
import org.eking.tourism.repository.entity.OrderShowVo;
import org.eking.tourism.repository.entity.RealUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* 订单入口
* @Author wangyu
* @Date 2018/3/22
*/
@RestController
public class OrderController {

    @Autowired
    private RealUserService realUserService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private AccessLogService accessLogService;

    /**
    *
    *下单
    *@param
    *@return
    *
    */
    @PostMapping("/createOrder")
    public ServiceResult createOrder(@RequestBody(required = false) Map map){
        ServiceResult result = new ServiceResult();

        String ticketName = map.get("ticketName").toString();
        int ticketCount = Integer.valueOf(map.get("ticketCount").toString());
        String name = map.get("name").toString();
        String papersNumber = map.get("papersNumber").toString();
        String facePhotoPath = map.get("facePhotoPath").toString();
        String mobilePhoneNumber = map.get("mobilePhoneNumber").toString();
        String openId = map.get("openId").toString();
        //1.创建实际游客信息，并获取id,将id填入订单信息
        RealUser realUser = new RealUser(name,papersNumber,facePhotoPath,mobilePhoneNumber,openId);
        int realUserId  = realUserService.createRealUser(realUser);

        //2.创建订单信息
        Order order =new Order();
        order.setRealUserId(realUserId);
        order.setTicketCount(ticketCount);
        order.setTicketName(ticketName);
        order.setOpenId(openId);
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
    @GetMapping("/page")
    public ServiceResult page(@RequestBody(required = false) Order order){

        List<OrderShowVo> list = new ArrayList<>();

        if (order == null){//无传参时，默认展示所有已确认订单

            list = orderService.page();
        }else {
            list = orderService.page(order);
        }
        return ServiceResultGenerator.genSuccessResult(list);
    }


}
