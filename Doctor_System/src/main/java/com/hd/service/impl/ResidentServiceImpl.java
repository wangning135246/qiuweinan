package com.hd.service.impl;

import com.hd.dao.ResidentMapper;
import com.hd.dao.SiteMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.Resident;
import com.hd.entity.po.ResidentListPo;
import com.hd.entity.request.AddResidentRequest;
import com.hd.entity.request.ModifyResidentRequest;
import com.hd.entity.response.ResidentResponse;
import com.hd.service.IResidentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentServiceImpl implements IResidentService {

    @Resource
    ResidentMapper residentMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    SiteMapper siteMapper;

    /**
     * 查询居民的方法
     * @param name
     * @return
     */
    @Override
    public ResidentResponse selectResident(String name) {
        //查询居民的基本信息
      List<Resident> list =  residentMapper.selectResident(name);
      ResidentResponse response = new ResidentResponse();
      List<ResidentListPo> listPoList = new ArrayList<>();
      for(Resident po : list){
          ResidentListPo listPo = new ResidentListPo();
          String siteName = siteMapper.selectSiteName(po.getSiteId());
          String doctorName = userMapper.selectAdminName(String.valueOf(po.getDoctorId()));
          listPo.setId(po.getId());
          listPo.setSiteName(siteName);
          listPo.setCreateTime(po.getMeasuringTime());
          listPo.setDiseaseLable(po.getDiseaselable());
          listPo.setResidentName(po.getName());
          listPo.setDoctorName(doctorName);
          listPo.setPhone(po.getPhone());
          listPoList.add(listPo);
      }
      response.setData(listPoList);
        return response;
    }

    /**
     * 添加居民的方法
     * @param request
     * @return
     */
    @Override
    public int insertResident(AddResidentRequest request) {
       int doctorId =  userMapper.selectDoctorId(request.getDoctorName());
       int siteId = siteMapper.selectSiteId(request.getSiteName());
        return residentMapper.insertResident(request.getResidentName(),String.valueOf(doctorId),String.valueOf(siteId),request.getDiseaseLable(),request.getPhone());
    }

    /**
     * 修改居民的方法
     * @param request
     * @return
     */
    @Override
    public int modifyResident(ModifyResidentRequest request) {
        int doctorId =  userMapper.selectDoctorId(request.getDoctorName());
        int siteId = siteMapper.selectSiteId(request.getSiteName());
        return residentMapper.modifyResident(request.getId(),request.getResidentName(),String.valueOf(doctorId),String.valueOf(siteId),request.getDiseaseLable(),request.getPhone());
    }


}
