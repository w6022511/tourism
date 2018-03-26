package org.eking.tourism.common.wechatentities;

/**
* 跳转类型的按钮类
* @Author wangyu
* @Date 2018/3/19 
*/  
public class ViewButton extends Button {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ViewButton{" +
                "url='" + url + '\'' +
                '}';
    }
}
