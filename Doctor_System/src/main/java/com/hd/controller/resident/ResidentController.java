package com.hd.controller.resident;


import com.hd.entity.request.AddResidentRequest;
import com.hd.entity.request.ModifyResidentRequest;
import com.hd.entity.response.ResidentResponse;
import com.hd.service.impl.ResidentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/resident")
public class ResidentController {

    @Resource
    ResidentServiceImpl residentService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("resident/diseaseList");
        return view;
    }

    @RequestMapping("/modifyIndex")
    public ModelAndView modifyIndex(String phone,String id,String residentName,String siteName,String doctorName,String diseaseLable){
        ModelAndView view = new ModelAndView("resident/diseaseModify");
        view.addObject("id",id);
        view.addObject("residentName",residentName);
        view.addObject("siteName",siteName);
        view.addObject("doctorName",doctorName);
        view.addObject("diseaseLable",diseaseLable);
        view.addObject("phone",phone);
        return view;
    }

    @RequestMapping("/addIndex")
    public ModelAndView addIndex(){
        ModelAndView view = new ModelAndView("resident/diseaseAdd");
        return view;
    }

    /**
     * 查询居民信息的方法
     * @param name
     * @return
     */
    @RequestMapping("/selectResident")
    @ResponseBody
    public ResidentResponse selectResident(String name){
        return residentService.selectResident(name);
    }

    /**
     * 添加居民的方法
     * @param request
     * @return
     */
    @RequestMapping("/addResident")
    @ResponseBody
    public int addResident(AddResidentRequest request){
        return residentService.insertResident(request);
    }

    /**
     * 修改居民的方法
     * @param request
     * @return
     */
    @RequestMapping("/modifyResident")
    @ResponseBody
    public int modifyResident(ModifyResidentRequest request){
        return residentService.modifyResident(request);
    }

}
