package com.hd.service.impl;

import com.hd.dao.ResidentMapper;
import com.hd.dao.SiteMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.Resident;
import com.hd.entity.User;
import com.hd.entity.po.DiseasePo;
import com.hd.entity.response.DoctorAndResidentResponse;
import com.hd.entity.response.ResidentDiseaseResponse;
import com.hd.service.IDiseaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiseaseServiceImpl implements IDiseaseService {

    @Resource
    ResidentMapper residentMapper;

    @Resource
    SiteMapper siteMapper;

    @Resource
    UserMapper userMapper;

    /**
     * 疾病标签的折线图
     * @return
     */
    @Override
    public ResidentDiseaseResponse selectDisease() {
        ResidentDiseaseResponse response =  new ResidentDiseaseResponse();
        List<String> dateList = new ArrayList<>();
        List<String> valueList = new ArrayList<>();
        List<DiseasePo> diseasePoList =  residentMapper.selectDisease();
        for(DiseasePo po:diseasePoList){
            dateList.add(po.getDiseaseLable());
            valueList.add(po.getSum());
        }
        response.setDateList(dateList);
        response.setValueList(valueList);
        return response;
    }

    /**
     * 查询人员分配情况的折线图
     * @return
     */
    @Override
    public DoctorAndResidentResponse selectDoctorAndResident() {
        DoctorAndResidentResponse response = new DoctorAndResidentResponse();
       List<User> userlist =  userMapper.selectBeautifulUSer("医生");
       //查询所有的站点
       List<String> siteList = siteMapper.selectAllSiteName();
       List<String> valueListDoctor = new ArrayList<>();
       int count = 0;
       //为医生的X和Y轴进行赋值
       for(String site:siteList){
           for(User user : userlist){
               if(site.equals(user.getSiteName())){
                   count++;
               }
           }
           valueListDoctor.add(String.valueOf(count));
           count = 0;
       }
       response.setDateListDoctor(siteList);
       response.setValueListDoctor(valueListDoctor);
       //查询所有的居民
       List<Resident> residentList =  residentMapper.selectAllResident();
       List<String> doctorList = new ArrayList<>();
       List<String> valueListResident = new ArrayList<>();
       int residentCount = 0;
       //为居民的X轴和Y轴进行赋值
        for(User user : userlist){
            for(Resident resident :residentList){
                if(String.valueOf(user.getId()).equals(String.valueOf(resident.getDoctorId()))){
                    residentCount++;
                }
            }
            doctorList.add(user.getName());
            valueListResident.add(String.valueOf(count));
            count = 0;
        }
        response.setDateListResident(doctorList);
        response.setValueListResident(valueListResident);
       return response;
    }
}
