package org.eking.tourism.repository.entity;

/**
 * table: t_tourism_wx_user
 */
public class User {
    private Integer id;

    /**
     * openID
     */
    private String openId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 身份证号
     */
    private String cardId;

    /**
     * 创建日期
     */
    private Integer createDate;

    /**
     * 最后更新日期
     */
    private Integer updateDate;

    /**
     * 1,男；2，女
     */
    private String sex;

    /**
     * 头像
     */
    private String headImage;

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
     * openID
     * @return OPEN_ID openID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * openID
     * @param openId openID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 昵称
     * @return NICK_NAME 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
     * 手机号码
     * @return PHONE_NUMBER 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 手机号码
     * @param phoneNumber 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 身份证号
     * @return CARD_ID 身份证号
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 身份证号
     * @param cardId 身份证号
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    /**
     * 创建日期
     * @return CREATE_DATE 创建日期
     */
    public Integer getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期
     * @param createDate 创建日期
     */
    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    /**
     * 最后更新日期
     * @return UPDATE_DATE 最后更新日期
     */
    public Integer getUpdateDate() {
        return updateDate;
    }

    /**
     * 最后更新日期
     * @param updateDate 最后更新日期
     */
    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 1,男；2，女
     * @return SEX 1,男；2，女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 1,男；2，女
     * @param sex 1,男；2，女
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 头像
     * @return HEAD_IMAGE 头像
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 头像
     * @param headImage 头像
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }
}