package com.hd.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/successLogin")
public class HeadController {

    @RequestMapping("/index")
    public ModelAndView successIndex(String userName){
        ModelAndView view = new ModelAndView("main/main");
        view.addObject("userName",userName);
        return view;
    }

    @RequestMapping("/index1")
    public ModelAndView successIndex(){
        ModelAndView view = new ModelAndView("main/photo");
        return view;
    }
}
