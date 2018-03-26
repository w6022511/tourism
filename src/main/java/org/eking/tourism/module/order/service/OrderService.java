package org.eking.tourism.module.order.service;

import org.eking.tourism.common.utils.CommonUtil;
import org.eking.tourism.repository.entity.Order;
import org.eking.tourism.repository.entity.OrderShowVo;
import org.eking.tourism.repository.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public int createOrder(Order order){

        order.setCreateDate(CommonUtil.getSysCurrentTimeSec());

        order.setOrderStatus("1");//状态为待确认
        orderMapper.insert(order);
        return order.getId();
    }

    public List<OrderShowVo> page(Order order){
        return orderMapper.page(order);
    }

    public List<OrderShowVo> page(){
        Order order = new Order();
        order.setOrderStatus("2");//不传参数时默认展示所有已确认订单
        return orderMapper.page(order);
    }
}
