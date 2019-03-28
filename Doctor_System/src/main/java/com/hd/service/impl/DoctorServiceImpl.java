package com.hd.service.impl;

import com.hd.dao.ResidentMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.User;
import com.hd.entity.po.DoctorListPo;
import com.hd.entity.response.DoctorListResponse;
import com.hd.service.IDoctorService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {


    @Resource
    UserMapper userMapper;

    @Resource
    ResidentMapper residentMapper;

    @Override
    public DoctorListResponse selectDoctorList(String name) {
        DoctorListResponse response = new DoctorListResponse();
        //查询出所有医生的信息
        List<User> list =  userMapper.selectBeautifulUSer("医生");
        List<DoctorListPo> listPo = new ArrayList<>();
        for(User po : list){
            DoctorListPo listPo1 =  new DoctorListPo();
            listPo1.setId(po.getId());
            listPo1.setAccount(po.getAccount());
            listPo1.setCreateTime(po.getCreateDate());
            listPo1.setPhone(po.getPhone());
            listPo1.setDoctorName(po.getName());
            listPo1.setResidentCount(String.valueOf(residentMapper.selectResidentCount(String.valueOf(po.getId()))));
            listPo.add(listPo1);
        }
        response.setData(listPo);
        return response;
    }

}
