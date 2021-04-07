package com.vjsoft.business.service.Impl;

import com.vjsoft.business.common.Const;
import com.vjsoft.business.common.ResponseCode;
import com.vjsoft.business.dao.UserMapper;
import com.vjsoft.business.pojo.User;
import com.vjsoft.business.service.IUserService;
import com.vjsoft.business.utils.DateUtils;
import com.vjsoft.business.utils.MD5Utils;
import com.vjsoft.business.utils.ServerResponse;
import com.vjsoft.business.vo.UserVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ServerResponse loginLogic(String username, String password) {
        //用户名密码非空判断
        //isEmpty
        //isBlank除了长度为空，还看字符串制表符或空格
        if (StringUtils.isBlank(username)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EMPTY.getCode(), ResponseCode.USERNAME_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(password)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_NOT_EMPTY.getCode(), ResponseCode.PASSWORD_NOT_EMPTY.getMsg());
        }
        //是否存在
        int count = userMapper.findByUsername(username);
        if (count == 0) {
            //用户名不存在
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EXIST.getCode(), ResponseCode.USERNAME_NOT_EXIST.getMsg());
        }
        //查询-密码加密
        User user = userMapper.findByUsernameAndPassword(username, MD5Utils.getMD5Code(password));
        if (user == null) {
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_ERROR.getCode(), ResponseCode.PASSWORD_ERROR.getMsg());
        }
        //返回结果
        return ServerResponse.createServerResponseBySuccess(conver(user));
    }

    public UserVO conver(User user){
        UserVO userVO=new UserVO();
        userVO.setId(user.getId());
        userVO.setUsername(user.getUsername());
        userVO.setEmail(user.getEmail());
        userVO.setPhone(user.getPhone());
        userVO.setCreateTime(DateUtils.dateToStr(user.getCreateTime()));
        userVO.setUpdateTime(DateUtils.dateToStr(user.getUpdateTime()));

        return userVO;
    }


    @Override
    public ServerResponse registerLogic(User user) {
        if (user == null) {
            return ServerResponse.createServerResponseByFail(ResponseCode.PARAMETER_NOT_EMPTY.getCode(), ResponseCode.PARAMETER_NOT_EMPTY.getMsg());
        }
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String question = user.getQuestion();
        String answer = user.getAnswer();
        String phone = user.getPhone();
        //用户名密码非空判断
        if (StringUtils.isBlank(username)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EMPTY.getCode(), ResponseCode.USERNAME_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(password)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_NOT_EMPTY.getCode(), ResponseCode.PASSWORD_NOT_EMPTY.getMsg());
        }

        if (StringUtils.isBlank(email)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.EMAIL_NOT_EMPTY.getCode(), ResponseCode.EMAIL_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(question)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.QUESTION_NOT_EMPTY.getCode(), ResponseCode.QUESTION_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(answer)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.ANSWER_NOT_EMPTY.getCode(), ResponseCode.ANSWER_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(phone)) {
            return ServerResponse.createServerResponseByFail(ResponseCode.PHONE_NOT_EMPTY.getCode(), ResponseCode.PHONE_NOT_EMPTY.getMsg());
        }
        //判断用户名存在
        int count = userMapper.findByUsername(username);
        if (count > 0) {
            //用户名存在
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_EXIST.getCode(), ResponseCode.USERNAME_EXIST.getMsg());
        }
        //判断邮箱是否已经存在
        int resE = userMapper.findByEmail(email);
        if (resE != 0) {
            return ServerResponse.createServerResponseByFail(ResponseCode.EMAIL_EXIST.getCode(), ResponseCode.EMAIL_EXIST.getMsg());
        }
        //注册
        user.setPassword(MD5Utils.getMD5Code(user.getPassword()));
        user.setRole(Const.NORMAIL_USER);
        int result = userMapper.insert(user);
        if (result == 0) {
            return ServerResponse.createServerResponseByFail(ResponseCode.REGISTER_FAIL.getCode(), ResponseCode.REGISTER_FAIL.getMsg());
        }
        return ServerResponse.createServerResponseBySuccess();
    }
}
