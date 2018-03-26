package org.eking.tourism.repository.entity;

/**
 * table: t_tourism_ticket_order
 */
public class Order {
    private Integer id;

    /**
     * 门票名称
     */
    private String ticketName;

    /**
     * 购买票数
     */
    private Integer ticketCount;

    /**
     * 订单创建时间
     */
    private Integer createDate;

    /**
     * 订单消费时间
     */
    private Integer updateDate;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 用户的openID,外键
     */
    private String openId;

    /**
     * 实际游客ID
     */
    private int realUserId;

    /**
     * 订单二维码
     */
    private String qrCodeId;

    /**
     * 
     * @return ID 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 门票名称
     * @return TICKET_NAME 门票名称
     */
    public String getTicketName() {
        return ticketName;
    }

    /**
     * 门票名称
     * @param ticketName 门票名称
     */
    public void setTicketName(String ticketName) {
        this.ticketName = ticketName == null ? null : ticketName.trim();
    }

    /**
     * 购买票数
     * @return TICKET_COUNT 购买票数
     */
    public Integer getTicketCount() {
        return ticketCount;
    }

    /**
     * 购买票数
     * @param ticketCount 购买票数
     */
    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    /**
     * 订单创建时间
     * @return CREATE_DATE 订单创建时间
     */
    public Integer getCreateDate() {
        return createDate;
    }

    /**
     * 订单创建时间
     * @param createDate 订单创建时间
     */
    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    /**
     * 订单消费时间
     * @return UPDATE_DATE 订单消费时间
     */
    public Integer getUpdateDate() {
        return updateDate;
    }

    /**
     * 订单消费时间
     * @param updateDate 订单消费时间
     */
    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 订单状态
     * @return ORDER_STATUS 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * 用户的openID,外键
     * @return OPEN_ID 用户的openID,外键
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 用户的openID,外键
     * @param openId 用户的openID,外键
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public int getRealUserId() {
        return realUserId;
    }

    public void setRealUserId(int realUserId) {
        this.realUserId = realUserId;
    }

    /**
     * 订单二维码
     * @return QR_CODE_ID 订单二维码
     */
    public String getQrCodeId() {
        return qrCodeId;
    }

    /**
     * 订单二维码
     * @param qrCodeId 订单二维码
     */
    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId == null ? null : qrCodeId.trim();
    }
}