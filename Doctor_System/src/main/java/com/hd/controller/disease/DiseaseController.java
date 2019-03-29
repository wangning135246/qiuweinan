package com.hd.controller.disease;


import com.hd.entity.response.DoctorAndResidentResponse;
import com.hd.entity.response.ResidentDiseaseResponse;
import com.hd.service.impl.DiseaseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/disease")
public class DiseaseController {

    @Resource
    DiseaseServiceImpl diseaseService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("disease/disease");
        return view;
    }

    @RequestMapping("/index1")
    public ModelAndView index1(){
        ModelAndView view = new ModelAndView("disease/disease1");
        return view;
    }

    /**
     * 查询医生的情况的接口
     * @return
     */
    @RequestMapping("/selectDoctorAndResident")
    @ResponseBody
    public DoctorAndResidentResponse selectDoctorAndResident(){
      return   diseaseService.selectDoctorAndResident();
    }

    /**
     * 查询疾病的接口
     * @return
     */
    @RequestMapping("/selectDisease")
    @ResponseBody
    public ResidentDiseaseResponse selectDisease(){
        return diseaseService.selectDisease();
    }
}
