package com.vjsoft.business.service;

import com.vjsoft.business.pojo.User;
import com.vjsoft.business.utils.ServerResponse;

public interface IUserService {
    //登录
    public ServerResponse loginLogic(String username,String password);
    //注册
    public ServerResponse registerLogic(User user);
}
