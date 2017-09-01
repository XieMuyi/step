package com.linmw.step.modules.system.service;

import com.linmw.step.modules.system.entity.User;
import com.linmw.step.modules.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getOne(long id){
        return userMapper.getOne(id);
    }

}
