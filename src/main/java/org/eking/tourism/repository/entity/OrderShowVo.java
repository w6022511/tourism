package org.eking.tourism.repository.entity;

import java.util.Date;

public class OrderShowVo {

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

    private String name;

    private String papersNumber;

    private String facePhotoPath;

    private String mobilePhoneNumber;

    private Integer recognitionType;

    private Date accessDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketName() {
        return ticketName;
    }

    public Integer getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getRealUserId() {
        return realUserId;
    }

    public void setRealUserId(int realUserId) {
        this.realUserId = realUserId;
    }

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;

    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPapersNumber() {
        return papersNumber;
    }

    public void setPapersNumber(String papersNumber) {
        this.papersNumber = papersNumber;
    }

    public String getFacePhotoPath() {
        return facePhotoPath;
    }

    public void setFacePhotoPath(String facePhotoPath) {
        this.facePhotoPath = facePhotoPath;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Integer getRecognitionType() {
        return recognitionType;
    }

    public void setRecognitionType(Integer recognitionType) {
        this.recognitionType = recognitionType;
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    @Override
    public String toString() {
        return "OrderShowVo{" +
                "id=" + id +
                ", ticketName='" + ticketName + '\'' +
                ", ticketCount=" + ticketCount +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", openId='" + openId + '\'' +
                ", realUserId=" + realUserId +
                ", qrCodeId='" + qrCodeId + '\'' +
                ", name='" + name + '\'' +
                ", papersNumber='" + papersNumber + '\'' +
                ", facePhotoPath='" + facePhotoPath + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", recognitionType=" + recognitionType +
                ", accessDate=" + accessDate +
                '}';
    }
}
