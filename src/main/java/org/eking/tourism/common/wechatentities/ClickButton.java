package org.eking.tourism.common.wechatentities;

/**
* 点击类型按钮
* @Author wangyu
* @Date 2018/3/19
*/
public class ClickButton extends Button {
    private String key;//菜单key值

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ClickButton{" +
                "key='" + key + '\'' +
                '}';
    }
}
