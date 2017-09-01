package com.linmw.step.modules.system.controller;

import com.linmw.step.modules.system.entity.User;
import com.linmw.step.modules.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getOne(Long id){
        User user = userService.getOne(id);
        return user;
    }
}
