package org.eking.tourism.repository.entity;

import java.util.Date;

/**
 * table: t_tourism_real_user
 */
public class RealUser {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String papersNumber;

    /**
     * 人脸照片保存路径
     */
    private String facePhotoPath;

    /**
     * 手机号码
     */
    private String mobilePhoneNumber;

    /**
     * 创建人
     */
    private String createByOpenId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 所属订单
     */
    private String ticketOrderId;

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
     * 姓名
     * @return NAME 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 身份证号
     * @return PAPERS_NUMBER 身份证号
     */
    public String getPapersNumber() {
        return papersNumber;
    }

    /**
     * 身份证号
     * @param papersNumber 身份证号
     */
    public void setPapersNumber(String papersNumber) {
        this.papersNumber = papersNumber == null ? null : papersNumber.trim();
    }

    /**
     * 人脸照片保存路径
     * @return FACE_PHOTO_PATH 人脸照片保存路径
     */
    public String getFacePhotoPath() {
        return facePhotoPath;
    }

    /**
     * 人脸照片保存路径
     * @param facePhotoPath 人脸照片保存路径
     */
    public void setFacePhotoPath(String facePhotoPath) {
        this.facePhotoPath = facePhotoPath == null ? null : facePhotoPath.trim();
    }

    /**
     * 手机号码
     * @return MOBILE_PHONE_NUMBER 手机号码
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * 手机号码
     * @param mobilePhoneNumber 手机号码
     */
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber == null ? null : mobilePhoneNumber.trim();
    }

    /**
     * 创建人
     * @return CREATE_BY_OPEN_ID 创建人
     */
    public String getCreateByOpenId() {
        return createByOpenId;
    }

    /**
     * 创建人
     * @param createByOpenId 创建人
     */
    public void setCreateByOpenId(String createByOpenId) {
        this.createByOpenId = createByOpenId == null ? null : createByOpenId.trim();
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
     * 所属订单
     * @return TICKET_ORDER_ID 所属订单
     */
    public String getTicketOrderId() {
        return ticketOrderId;
    }

    /**
     * 所属订单
     * @param ticketOrderId 所属订单
     */
    public void setTicketOrderId(String ticketOrderId) {
        this.ticketOrderId = ticketOrderId == null ? null : ticketOrderId.trim();
    }

    public RealUser(String name, String papersNumber, String facePhotoPath, String mobilePhoneNumber, String createByOpenId) {
        this.name = name;
        this.papersNumber = papersNumber;
        this.facePhotoPath = facePhotoPath;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.createByOpenId = createByOpenId;
    }

    public RealUser() {
    }
}