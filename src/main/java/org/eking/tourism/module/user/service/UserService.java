package org.eking.tourism.module.user.service;

import org.eking.tourism.common.utils.CommonUtil;
import org.eking.tourism.repository.entity.User;
import org.eking.tourism.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public boolean createUser(User user){
        user.setCreateDate(CommonUtil.getSysCurrentTimeSec());
        if (userMapper.insert(user) > 0){
            return true;
        }

        return false;
    }

    public User getUserByOpenId(String openId){

        return userMapper.selectByOpenId(openId);
    }
}
