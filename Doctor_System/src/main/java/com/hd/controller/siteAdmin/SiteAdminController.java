package com.hd.controller.siteAdmin;


import com.hd.entity.response.SiteListResponse;
import com.hd.service.impl.SiteAdminServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/siteAdmin")
public class SiteAdminController {


    @Resource
    SiteAdminServiceImpl siteAdminService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("siteadmin/siteAdminList");
        return view;
    }

    @RequestMapping("/modifyIndex")
    public ModelAndView modifyIndex(String id,String name,String phone,String doctorCount,String account,String adminName){
        ModelAndView view = new ModelAndView("siteadmin/siteAdminModify");
        view.addObject("id",id);
        view.addObject("name",name);
        view.addObject("phone",phone);
        view.addObject("doctorCount",doctorCount);
        view.addObject("account",account);
        view.addObject("adminName",adminName);
        return view;
    }


    @RequestMapping("/selectSiteAdmin")
    @ResponseBody
    public SiteListResponse selectSiteAdmin(String name){
       return   siteAdminService.selectAdminList(name);
    }

    @RequestMapping("/modifyAdminUser")
    @ResponseBody
    public int modifyAdminUser(String id,String name,String phone){
        return siteAdminService.modifyAdminUser(id,name,phone);
    }

    @RequestMapping("/insertSiteAdmin")
    @ResponseBody
    public int insertSiteAdmin(){
        return siteAdminService.modifyAdminUser(id,name,phone);
    }



}
