package com.hd.service.impl;

import com.hd.dao.ResidentMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.User;
import com.hd.entity.po.DoctorListPo;
import com.hd.entity.request.addDoctorRequest;
import com.hd.entity.request.addSiteAdminRequest;
import com.hd.entity.response.DoctorListResponse;
import com.hd.service.IDoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorServiceImpl implements IDoctorService {


    @Resource
    UserMapper userMapper;

    @Resource
    ResidentMapper residentMapper;

    /**
     * 查询医生列表的方法
     * @param name
     * @return
     */
    @Override
    public DoctorListResponse selectDoctorList(String name) {
        DoctorListResponse response = new DoctorListResponse();
        //查询出所有医生的信息
        List<User> list =  userMapper.selectBeautifulUSer("医生");
        List<DoctorListPo> listPo = new ArrayList<>();
        if(name != null){
            List<DoctorListPo> listPo2 = new ArrayList<>();
            for(User po:list){
                DoctorListPo listPo3 =  new DoctorListPo();
                if(po.getName().equals(name)){
                    listPo3.setId(po.getId());
                    listPo3.setAccount(po.getAccount());
                    listPo3.setCreateTime(po.getCreateDate());
                    listPo3.setPhone(po.getPhone());
                    listPo3.setDoctorName(po.getName());
                    listPo3.setResidentCount(String.valueOf(residentMapper.selectResidentCount(String.valueOf(po.getId()))));
                    listPo.add(listPo3);
                    response.setData(listPo);
                    return response;
                }
            }
        }
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

    /**
     * 修改医生的方法
     * @param id
     * @param name
     * @param phone
     * @return
     */
    @Override
    public int modifyAdminUser(String id, String name, String phone) {
        return userMapper.modifyAdminUser(id,name,phone);
    }

    /**
     * 添加医生的方法
     * @param request
     * @return
     */
    @Override
    public int insertDoctor(addDoctorRequest request) {
        int a = 0;
        try {
             a = userMapper.insertAdminUser(request.getDoctorName(), request.getSiteAdminAccount(),
                    request.getPassword(), request.getPhone(), request.getSiteName(),
                    request.getAddress());
        }catch (Exception e){
            e.printStackTrace();
        }
        User user = userMapper.selectSiteAdmin(request.getDoctorName());
        userMapper.insertAuth_user_role(String.valueOf(user.getId()),String.valueOf(2));
        return a;
    }
}
