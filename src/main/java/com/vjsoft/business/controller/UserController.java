package com.vjsoft.business.controller;

import com.vjsoft.business.common.Const;
import com.vjsoft.business.pojo.User;
import com.vjsoft.business.service.IUserService;
import com.vjsoft.business.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/portal/")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "user/login.do")
    public ServerResponse login(String username, String password, HttpSession session){
        ServerResponse serverResponse=userService.loginLogic(username,password);
        if (serverResponse.isSucess()){
            session.setAttribute(Const.CURRENT_USER,serverResponse.getData());
        }
        return serverResponse;
    }

    @RequestMapping("user/register.do")
    public ServerResponse register(User user){
        return userService.registerLogic(user);
    }
}
