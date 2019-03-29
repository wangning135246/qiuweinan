package com.hd.controller.site;


import com.hd.entity.request.siteRequest;
import com.hd.entity.response.SiteResponse;
import com.hd.service.impl.SiteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/siteList")
public class SiteController {

    @Resource
    SiteServiceImpl siteService;

    @RequestMapping("/siteIndex")
    public ModelAndView userIndex(){
        ModelAndView view = new ModelAndView("site/site-list");
        return view;
    }

    @RequestMapping("/siteAddIndex")
    public ModelAndView userAddIndex(){
        ModelAndView view = new ModelAndView("site/site-add");
        return view;
    }

    @RequestMapping("/siteModifyIndex")
    public ModelAndView siteModifyIndex(String id,String name,String doctorCount,String adminCount,String status){
        ModelAndView view = new ModelAndView("site/site-modify");
        view.addObject("id",id);
        view.addObject("name",name);
        view.addObject("status",status);
        view.addObject("doctorCount",doctorCount);
        view.addObject("adminCount",adminCount);
        return view;
    }

    /**
     * 查询站点下的站点管理员和医生
     * @return
     */
    @RequestMapping("/selectSiteList")
    @ResponseBody
    public SiteResponse selectSiteCount(String siteName){
        SiteResponse response= siteService.selectSiteCount(siteName);
        return response;
    }

    /**
     * 添加站点的方法
     * @return
     */
    @RequestMapping("/insertSite")
    @ResponseBody
    public int insertSite(siteRequest request){
         return siteService.insertSite(request);
    }

    /**
     * 删除站点的方法
     * @return
     */
    @RequestMapping("/deleteSite")
    @ResponseBody
    public int deleteSite(Integer id){
        return siteService.deleteSite(id);
    }

    /**
     * 删除站点的方法
     * @return
     */
    @RequestMapping("/deleteCheckedSite")
    @ResponseBody
    public int deleteCheckedSite(String id){

        return siteService.deleteCheckedSite(id);

    }

    /**
     * 修改站点的方法
     * @return
     */
    @RequestMapping("/modifySite")
    @ResponseBody
    public int modifySite(Integer id,String name,Integer status){
        return siteService.modifySite(id,name,status);
    }


}
