package com.hd.service.impl;


import com.hd.dao.UserMapper;
import com.hd.entity.response.UserResponse;
import com.hd.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        Integer roleID = userMapper.selectUserRole(userMapper.login(account,pwd).getId());
        String roleName = userMapper.selectRoleName(roleID);
        response.setData(roleName);
            return response;
    }

}
