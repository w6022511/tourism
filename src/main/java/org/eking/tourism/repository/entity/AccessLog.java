package org.eking.tourism.repository.entity;

import java.util.Date;

/**
 * table: t_tourism_access_log
 */
public class AccessLog {
    private Long id;

    /**
     * 订单id
     */
    private Integer ticketOrderId;

    /**
     * 用户id
     */
    private Integer realUserId;

    /**
     * 通行方式
     */
    private Integer recognitionType;

    private Integer status;

    private Date accessDate;

    /**
     * 
     * @return ID 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 订单id
     * @return TICKET_ORDER_ID 订单id
     */
    public Integer getTicketOrderId() {
        return ticketOrderId;
    }

    /**
     * 订单id
     * @param ticketOrderId 订单id
     */
    public void setTicketOrderId(Integer ticketOrderId) {
        this.ticketOrderId = ticketOrderId;
    }

    /**
     * 用户id
     * @return REAL_USER_ID 用户id
     */
    public Integer getRealUserId() {
        return realUserId;
    }

    /**
     * 用户id
     * @param realUserId 用户id
     */
    public void setRealUserId(Integer realUserId) {
        this.realUserId = realUserId;
    }

    /**
     * 通行方式
     * @return RECOGNITION_TYPE 通行方式
     */
    public Integer getRecognitionType() {
        return recognitionType;
    }

    /**
     * 通行方式
     * @param recognitionType 通行方式
     */
    public void setRecognitionType(Integer recognitionType) {
        this.recognitionType = recognitionType;
    }

    /**
     * 
     * @return STATUS 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return ACCESS_DATE
     */
    public Date getAccessDate() {
        return accessDate;
    }

    /**
     *
     * @param accessDate
     */
    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }
}