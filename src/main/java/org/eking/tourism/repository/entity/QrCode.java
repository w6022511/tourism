package org.eking.tourism.repository.entity;

import java.util.Date;

/**
 * table: t_tourism_qr_code
 */
public class QrCode {
    private Integer id;

    /**
     * 二维码编号
     */
    private String no;

    private String uuid;

    /**
     * 订单ID
     */
    private String ticketOrderId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 二维码存放路径
     */
    private String qrCodePhotoPath;

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
     * 二维码编号
     * @return NO 二维码编号
     */
    public String getNo() {
        return no;
    }

    /**
     * 二维码编号
     * @param no 二维码编号
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * 
     * @return UUID 
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid 
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * 订单ID
     * @return TICKET_ORDER_ID 订单ID
     */
    public String getTicketOrderId() {
        return ticketOrderId;
    }

    /**
     * 订单ID
     * @param ticketOrderId 订单ID
     */
    public void setTicketOrderId(String ticketOrderId) {
        this.ticketOrderId = ticketOrderId == null ? null : ticketOrderId.trim();
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
     * 二维码存放路径
     * @return QR_CODE_PHOTO_PATH 二维码存放路径
     */
    public String getQrCodePhotoPath() {
        return qrCodePhotoPath;
    }

    /**
     * 二维码存放路径
     * @param qrCodePhotoPath 二维码存放路径
     */
    public void setQrCodePhotoPath(String qrCodePhotoPath) {
        this.qrCodePhotoPath = qrCodePhotoPath == null ? null : qrCodePhotoPath.trim();
    }
}