package org.eking.tourism.module.user.controller;


import org.eking.tourism.common.common.ErrorCode;
import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.interceptor.DoAuth;
import org.eking.tourism.module.user.service.UserService;
import org.eking.tourism.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* 用户入口
* @Author wangyu
* @Date 2018/3/19
*/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ServiceResult createUser(@RequestBody User user){
        ServiceResult result = new ServiceResult();
        if (userService.createUser(user)){
            result.setErrorCode(ErrorCode.SUCCESS.getCode());
        }else {
            result.setErrorCode(ErrorCode.ERROR.getCode());
        }
        return result;

    }

    @GetMapping("/getUserByOpenId/{openId}")
    public ServiceResult getUserByOpenId(@PathVariable("openId") String openId){
        ServiceResult result = new ServiceResult();

        User user = userService.getUserByOpenId(openId);

        result.setBody(user);
        result.setErrorCode(ErrorCode.SUCCESS.getCode());

        return result;

    }
}
