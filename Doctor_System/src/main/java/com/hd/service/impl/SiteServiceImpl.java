package com.hd.service.impl;


import com.hd.dao.SiteMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.po.SiteListPo;
import com.hd.entity.po.SiteNameListPo;
import com.hd.entity.request.siteRequest;
import com.hd.entity.response.SiteResponse;
import com.hd.service.ISiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SiteServiceImpl implements ISiteService {

    @Resource
    SiteMapper siteMapper;

    @Resource
    UserMapper userMapper;

    /**
     * 查询站点下的站点管理员和医生
     * @return
     */
    @Override
    public SiteResponse selectSiteCount(String siteName) {
        //判断掺入的参数是不是空
        if (siteName.equals("")){
            siteName = null;
        }
        //查询出站点表的全部数据
        List<SiteNameListPo> list = new ArrayList<>();
        try {
             list = siteMapper.selectSiteNameAndTime(siteName);
        }catch (Exception e){
         e.printStackTrace();
        }
        List<SiteListPo> listPoList = new ArrayList<>();
        SiteResponse response = new SiteResponse();
        int siteCount = 0;
        int doctorCount = 0;
        for(SiteNameListPo po:list){
            //查询出在每一个站点下的用户id
            List<Integer> idList = userMapper.selectSiteCount(po.getSiteName());
            SiteListPo listPo = new SiteListPo();
            for(Integer id:idList){
                Integer roleId = userMapper.selectUserRole(id);
                //根据查询出的用户的id计算数量
                if(userMapper.selectRoleName(roleId).equals("分站管理员")){
                        siteCount+=1;
                }else if(userMapper.selectRoleName(roleId).equals("医生")){
                        doctorCount+=1;
                }
            }
            //为封装好的List进行赋值
            listPo.setId(po.getId());
            listPo.setSiteName(po.getSiteName());
            listPo.setCreateTime(po.getCreateDate());
            listPo.setStatus(po.getStatus());
            listPo.setSiteCount(siteCount);
            listPo.setDoctorCount(doctorCount);
            listPoList.add(listPo);
            siteCount = 0;
            doctorCount = 0;
        }

        response.setData(listPoList);
        return response;
    }

    /**
     * 这个是添加站点的方法
     * @param request
     * @return
     */
    @Override
    public int insertSite(siteRequest request) {
        String[] doctorNames =  request.getDoctorName().split(",");
        for(int i = 0 ; i < doctorNames.length ; i++){
            //修改医生的所属的站点
            userMapper.modifyUserSiteName(doctorNames[i],request.getName());
        }
        //修改管理员的所属的站点
        userMapper.modifyUserSiteName(request.getSiteAdmin(),request.getName());
        //添加该站点的名字和状态
        return siteMapper.insertSite(request.getName(),request.getStatus());

    }

    /**
     *这个是删除站点的方法
     * @param id
     * @return
     */
    @Override
    public Integer deleteSite(Integer id) {
        String siteName = siteMapper.selectSiteName(id);
        userMapper.modifyUserSite(siteName);
        return siteMapper.deleteSite(id);
    }

    /**
     * 这个是修改站点的方法
     * @param id
     * @param name
     * @return
     */
    @Override
    public Integer modifySite(Integer id, String name,Integer status) {
        String oldName = siteMapper.selectSiteName(id);
        userMapper.modifyUserSiteName(oldName,name);
        return siteMapper.modifySite(id,name,status);
    }


}
