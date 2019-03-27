package com.hd.service;


import com.hd.entity.response.UserResponse;

public interface IUserService {

    /**
     * 这个是登陆的账号密码的方法
     * @param account
     * @param pwd
     * @return
     */
    UserResponse login(String account, String pwd);

}
