package org.eking.tourism.repository.entity;

import java.util.Date;

/**
 * table: t_tourism_auth_history
 */
public class AuthHistory {
    private Long id;

    /**
     * 订单id
     */
    private Long ticketOrderId;

    /**
     * 实际使用人id
     */
    private Long realUserId;

    /**
     * 二维码编号
     */
    private Integer qrCodeId;

    /**
     * 创建人（微信用户）
     */
    private Integer createByOpenId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 识别方式
     */
    private Integer recognitionType;

    /**
     * 厂商id
     */
    private Integer factoryId;

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
    public Long getTicketOrderId() {
        return ticketOrderId;
    }

    /**
     * 订单id
     * @param ticketOrderId 订单id
     */
    public void setTicketOrderId(Long ticketOrderId) {
        this.ticketOrderId = ticketOrderId;
    }

    /**
     * 实际使用人id
     * @return REAL_USER_ID 实际使用人id
     */
    public Long getRealUserId() {
        return realUserId;
    }

    /**
     * 实际使用人id
     * @param realUserId 实际使用人id
     */
    public void setRealUserId(Long realUserId) {
        this.realUserId = realUserId;
    }

    /**
     * 二维码编号
     * @return QR_CODE_ID 二维码编号
     */
    public Integer getQrCodeId() {
        return qrCodeId;
    }

    /**
     * 二维码编号
     * @param qrCodeId 二维码编号
     */
    public void setQrCodeId(Integer qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    /**
     * 创建人（微信用户）
     * @return CREATE_BY_OPEN_ID 创建人（微信用户）
     */
    public Integer getCreateByOpenId() {
        return createByOpenId;
    }

    /**
     * 创建人（微信用户）
     * @param createByOpenId 创建人（微信用户）
     */
    public void setCreateByOpenId(Integer createByOpenId) {
        this.createByOpenId = createByOpenId;
    }

    /**
     * 创建时间
     * @return CREATE_DATE 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 开始时间
     * @return START_DATE 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 开始时间
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 结束时间
     * @return END_DATE 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 结束时间
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 识别方式
     * @return RECOGNITION_TYPE 识别方式
     */
    public Integer getRecognitionType() {
        return recognitionType;
    }

    /**
     * 识别方式
     * @param recognitionType 识别方式
     */
    public void setRecognitionType(Integer recognitionType) {
        this.recognitionType = recognitionType;
    }

    /**
     * 厂商id
     * @return FACTORY_ID 厂商id
     */
    public Integer getFactoryId() {
        return factoryId;
    }

    /**
     * 厂商id
     * @param factoryId 厂商id
     */
    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }
}