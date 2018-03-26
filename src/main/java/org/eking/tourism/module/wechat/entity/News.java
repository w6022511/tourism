package org.eking.tourism.module.wechat.entity;

/**
* 图文消息子类
* @Author wangyu
* @Date 2018/3/21
*/
public class News {

    private String Title;//标题

    private String Description;//描述，多图文不显示描述

    private String PicUrl;//图片链接

    private String Url;//文章链接

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
