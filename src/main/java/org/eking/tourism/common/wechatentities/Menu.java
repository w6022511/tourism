package org.eking.tourism.common.wechatentities;

import java.util.Arrays;

/**
* 菜单类
* @Author wangyu
* @Date 2018/3/19
*/
public class Menu {

    private Button[] button;

    public Button[] getButton() {
        return button;
    }

    public void setButton(Button[] button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "button=" + Arrays.toString(button) +
                '}';
    }
}
