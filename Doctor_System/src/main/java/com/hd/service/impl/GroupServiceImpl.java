package com.hd.service.impl;

import com.hd.dao.ResidentMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.User;
import com.hd.entity.po.GroupPo;
import com.hd.entity.response.GroupResponse;
import com.hd.service.IGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Resource
    UserMapper userMapper;

    @Resource
    ResidentMapper residentMapper;

    /**
     * 查询小组的方法
     * @return
     */
    @Override
    public GroupResponse selectGroup() {
        GroupResponse response = new GroupResponse();
        List<GroupPo> poList = new ArrayList<>();
        List<User> list = userMapper.selectBeautifulUSer("医生");
        for(User po : list){
            GroupPo groupPo = new GroupPo();
           int residentCount =  residentMapper.selectResidentCount(String.valueOf(po.getId()));
           groupPo.setId(String.valueOf(po.getId()));
           groupPo.setGroupCount(String.valueOf(residentCount));
           groupPo.setGroupName(po.getName());
           poList.add(groupPo);
        }
        response.setData(poList);
        return response;
    }

    /**
     * 删除小组的方法
     * @param id
     * @return
     */
    @Override
    public int deleteGroup(int id) {
      int a =   residentMapper.modifyDoctorId(String.valueOf(id));
      return a;
    }


}
