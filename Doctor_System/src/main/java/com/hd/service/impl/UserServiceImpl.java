package com.hd.service.impl;


import com.hd.dao.UserMapper;
import com.hd.entity.User;
import com.hd.entity.response.UserResponse;
import com.hd.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 用户登陆的方法
     * @param account
     * @param pwd
     * @return
     */
    @Override
    public UserResponse login(String account, String pwd) {
        UserResponse response = new UserResponse();
        User user = userMapper.login(account,pwd);
        if(user != null){
            int id =  user.getId();
            Integer roleID = userMapper.selectUserRole(id);
            String roleName = userMapper.selectRoleName(roleID);
            response.setData(roleName);
            return response;
        }else {
            response.setData(String.valueOf(0));
            return response;
        }

    }

}
