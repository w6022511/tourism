package org.eking.tourism.module.realuser;

import org.eking.tourism.repository.entity.RealUser;
import org.eking.tourism.repository.mapper.RealUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class RealUserService {

    @Autowired
    private RealUserMapper realUserMapper;

    @Transactional
    public int createRealUser(RealUser realUser){

        realUser.setCreateDate(new Date());
        realUserMapper.insert(realUser);
        return realUser.getId();
    }
}
