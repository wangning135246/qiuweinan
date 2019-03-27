package com.hd.controller.main;

import com.hd.entity.response.UserResponse;
import com.hd.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("userLogin")
public class LoginController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("main/login");
        return view;
    }

    /**
     * 用户登陆的方法
     * @param account
     * @param pwd
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public UserResponse login(String account, String pwd){
        return userService.login(account,pwd);
    }
}
