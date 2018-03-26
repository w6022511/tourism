package org.eking.tourism.common.wechatentities;

import java.util.Arrays;

/**
* 自定义菜单，按钮类
* @Author wangyu
* @Date 2018/3/19
*/
public class Button {

    private String name;//菜单标题

    private String type;//菜单的响应动作类型

    private Button[] sub_button;//二级菜单数组

    private String key;//菜单KEY值，用于消息接口推送

    private String url;//网页链接


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Button[] getSub_button() {
        return sub_button;
    }

    public void setSub_button(Button[] sub_button) {
        this.sub_button = sub_button;
    }

    @Override
    public String toString() {
        return "Button{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sub_button=" + Arrays.toString(sub_button) +
                '}';
    }
}
