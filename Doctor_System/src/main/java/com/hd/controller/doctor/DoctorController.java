package com.hd.controller.doctor;


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
    public ModelAndView modifyIndex(){
        ModelAndView view = new ModelAndView("doctor/doctorModify");
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

}
