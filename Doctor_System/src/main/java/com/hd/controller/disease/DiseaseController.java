package com.hd.controller.disease;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/disease")
public class DiseaseController {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("disease/disease");
        return view;
    }
}
