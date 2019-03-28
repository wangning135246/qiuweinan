package com.hd.controller.doctor;


import com.hd.entity.request.addDoctorRequest;
import com.hd.entity.response.DoctorListResponse;
import com.hd.service.impl.DoctorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Resource
    DoctorServiceImpl doctorService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("doctor/doctorList");
        return view;
    }

    @RequestMapping("/addIndex")
    public ModelAndView addIndex(){
        ModelAndView view = new ModelAndView("doctor/doctorAdd");
        return view;
    }

    @RequestMapping("/modifyIndex")
    public ModelAndView modifyIndex(String id,String name,String account,String phone,String adminName,String residentCount){
        ModelAndView view = new ModelAndView("doctor/doctorModify");
        view.addObject("id",id);
        view.addObject("account",account);
        view.addObject("phone",phone);
        view.addObject("adminName",adminName);
        view.addObject("residentCount",residentCount);
        view.addObject("name",name);
        return view;
    }

    @RequestMapping("/distributeIndex")
    public ModelAndView distributeIndex(){
        ModelAndView view = new ModelAndView("doctor/doctorDistribute");
        return view;
    }

    /**
     * 查询医生的方法
     * @param name
     * @return
     */
    @RequestMapping("/selectDoctor")
    @ResponseBody
    public DoctorListResponse selectDoctor(String name) {
        return doctorService.selectDoctorList(name);
    }

    /**
     * 修改医生信息的方法
     * @param id
     * @param name
     * @param phone
     * @return
     */
    @RequestMapping("/modifyDoctor")
    @ResponseBody
    public int modifyDoctor(String id,String name,String phone){
        return doctorService.modifyAdminUser(id,name,phone);
    }

    /**
     * 添加医生的方法
     * @param request
     * @return
     */
    @RequestMapping("/addDoctor")
    @ResponseBody
    public int insertDoctor(addDoctorRequest request){
        return doctorService.insertDoctor(request);
    }

}
