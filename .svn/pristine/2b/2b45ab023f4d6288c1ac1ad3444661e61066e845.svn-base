package org.eking.tourism.module.menu.controller;

import net.sf.json.JSONObject;
import org.eking.tourism.common.common.ErrorCode;
import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.utils.AccessTokenUtil;
import org.eking.tourism.common.wechatentities.Menu;
import org.eking.tourism.module.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class MeunController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/createMenu")
    public ServiceResult createMenu(@RequestBody Menu menu){

        ServiceResult result = new ServiceResult();
        String menuStr = JSONObject.fromObject(menu).toString();
        JSONObject json = menuService.createMenu(menuStr);
        if (json.getInt("errcode") == 0){
            result.setErrorCode(ErrorCode.SUCCESS.getCode());
            result.setMessage(ErrorCode.SUCCESS.getMessage());
        }else {
            result.setErrorCode(ErrorCode.ERROR.getCode());
            result.setMessage(ErrorCode.ERROR.getMessage());
        }

        result.setBody(json);

        return result;

    }

    /**
    *
    *获取自定义列表
    *@param
    *@return
    *
    */
    @GetMapping(value = "/getMenu",produces = "application/json;charset=UTF-8")
    public ServiceResult getMenu(){
        ServiceResult result = new ServiceResult();

        try {
            result.setBody(menuService.getMenu());
            result.setMessage(ErrorCode.SUCCESS.getMessage());
            result.setErrorCode(ErrorCode.SUCCESS.getCode());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            result.setBody(e.toString());
            result.setMessage(ErrorCode.ERROR.getMessage());
            result.setErrorCode(ErrorCode.ERROR.getCode());

        }finally {

            return result;
        }
    }
}
