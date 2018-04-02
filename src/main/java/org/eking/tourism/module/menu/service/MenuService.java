package org.eking.tourism.module.menu.service;

import net.sf.json.JSONObject;
import org.eking.tourism.common.constant.WeChatAPIConstant;
import org.eking.tourism.common.utils.WeChatUtil;
import org.eking.tourism.common.utils.HttpUtil;
import org.eking.tourism.common.wechatentities.Button;
import org.eking.tourism.common.wechatentities.ClickButton;
import org.eking.tourism.common.wechatentities.Menu;
import org.eking.tourism.common.wechatentities.ViewButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
*
* @Author wangyu
* @Date 2018/3/19
*/
@Service
public class MenuService {

    @Autowired
    private WeChatUtil accessTokenUtil;

    @Value("${wechat.domain}")
    private String domain;

    /**
     * 创建菜单
     * @param menu
     * @param menu 菜单json格式字符串
     * @return
     */
    public JSONObject createMenu(String menu){
        //int result = Integer.MIN_VALUE;
        String newMenu = menu.replaceAll("domain",domain);
        System.err.println(newMenu);
        String url = WeChatAPIConstant.CTRATE_MENU_URL.replace("ACCESS_TOKEN", accessTokenUtil.getAccessToken().getAccess_token());
        JSONObject json = HttpUtil.doPost(url, newMenu);
        /*if(json!=null){
            //从返回的数据包中取数据{"errcode":0,"errmsg":"ok"}
            result = json.getInt("errcode");
        }*/
        return json;
    }

    public JSONObject getMenu() throws UnsupportedEncodingException {

        String url = WeChatAPIConstant.GET_MENU_URL.replace("ACCESS_TOKEN", accessTokenUtil.getAccessToken().getAccess_token());
        JSONObject result = HttpUtil.doGet(url);
        return result;
    }

    /**
    *
    *自定义菜单创建测试DeMo
    *@param
    *@return
    *
    */
    public Menu initMenu(){
        Menu menu =new Menu();
        ViewButton view1 = new ViewButton();
        view1.setName("微信登录");
        view1.setUrl("http://ufq2ka.natappfree.cc/wechat/login");
        view1.setType("view");

        ViewButton view2 = new ViewButton();
        view2.setName("点赞");
        view2.setUrl("http://ufq2ka.natappfree.cc/wechat/message");
        view2.setType("view");

        Button button1 = new Button();
        button1.setName("菜单");
        button1.setSub_button(new Button[]{view1,view2});

        ViewButton view3 = new ViewButton();
        view3.setName("网易云");
        view3.setUrl("http://music.163.com/");
        view3.setType("view");

        ClickButton clickButton = new ClickButton();
        clickButton.setName("扫一扫");
        clickButton.setType("scancode_push");
        clickButton.setKey("clickB");

        Button button2 = new Button();
        button2.setName("打开看");
        button2.setSub_button(new Button[]{view3,clickButton});

        menu.setButton(new Button[]{button1,button2});

        return menu;
    }
}
