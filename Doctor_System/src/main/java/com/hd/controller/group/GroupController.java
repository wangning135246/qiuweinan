package com.hd.controller.group;


import com.hd.entity.response.GroupResponse;
import com.hd.service.impl.GroupServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/group")
public class GroupController {

    @Resource
    GroupServiceImpl groupService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("group/groupList");
        return view;
    }

    /**
     * 查询小组的信息
     * @return
     */
    @RequestMapping("/selectGroup")
    @ResponseBody
    public GroupResponse selectGroup(){
        return groupService.selectGroup();
    }

    @RequestMapping("/deleteGroup")
    @ResponseBody
    public int deleteGroup(int id){
        return groupService.deleteGroup(id);
    }

}
