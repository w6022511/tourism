package org.eking.tourism.module.accesslog.service;

import org.eking.tourism.repository.entity.AccessLog;
import org.eking.tourism.repository.mapper.AccessLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class AccessLogService {

    @Autowired
    private AccessLogMapper accessLogMapper;

    @Transactional
    public void insert(int orderId,int realUserId){

        AccessLog accessLog = new AccessLog();
        accessLog.setTicketOrderId(orderId);
        accessLog.setRealUserId(realUserId);
        accessLogMapper.insert(accessLog);
    }

    public void update(AccessLog accessLog){
        accessLog.setAccessDate(new Date());

        accessLogMapper.updateByOrderId(accessLog);
    }
}
