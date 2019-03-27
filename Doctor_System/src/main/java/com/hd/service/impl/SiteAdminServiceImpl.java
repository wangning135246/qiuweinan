package com.hd.service.impl;

import com.hd.dao.SiteMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.User;
import com.hd.entity.po.SiteAdminListPo;
import com.hd.entity.response.SiteListResponse;
import com.hd.service.ISiteAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SiteAdminServiceImpl implements ISiteAdminService {

    @Resource
    SiteMapper siteMapper;

    @Resource
    UserMapper userMapper;

    /**
     * 查询分站管理员的列表
     * @param name
     * @return
     */
    @Override
    public SiteListResponse selectAdminList(String name) {
        //创建response
        SiteListResponse response = new SiteListResponse();
        //查询user表下的所有用户
        List<User> userList =  userMapper.selectAllUser();
        int doctorCount = 0;
        //创建reponse的接受对象
        List<SiteAdminListPo> poList = new ArrayList<>();
        //=====================》》》》》
        if(name != null && !name.equals("") ){
            //
            SiteAdminListPo adminListPo = new SiteAdminListPo();
            User user = userMapper.selectSiteAdmin(name);
            //查询该站点的所有user
            List<Integer> idList = userMapper.selectSiteCount(user.getSiteName());
            for(Integer id : idList){
                //查询该站点下用户是否是医生
                String userRoleNames =  userMapper.selectRoleName(userMapper.selectUserRole(id));
                if(userRoleNames.equals("医生")){
                    doctorCount++;
                }
            }
            adminListPo.setId(user.getId());
            adminListPo.setAccount(user.getAccount());
            adminListPo.setAdminName(user.getName());
            adminListPo.setPhone(user.getPhone());
            adminListPo.setDoctorCount(String.valueOf(doctorCount));
            doctorCount = 0;
            adminListPo.setCreateTime(user.getCreateDate());
            adminListPo.setSiteName(user.getSiteName());
            poList.add(adminListPo);
            response.setData(poList);
            return response;
        }else{
            for(User po : userList){
                //查询出每个用户的角色
                String userRoleName =  userMapper.selectRoleName(userMapper.selectUserRole(po.getId()));
                if (userRoleName.equals("分站管理员")) {
                    SiteAdminListPo adminListPo = new SiteAdminListPo();
                    //查询出该站点下的user
                    List<Integer> idList = userMapper.selectSiteCount(po.getSiteName());
                    for(Integer id : idList){
                        //查询该站点下用户是否是医生
                        String userRoleNames =  userMapper.selectRoleName(userMapper.selectUserRole(id));
                        if(userRoleNames.equals("医生")){
                            doctorCount++;
                        }
                    }
                    adminListPo.setId(po.getId());
                    adminListPo.setAccount(po.getAccount());
                    adminListPo.setAdminName(po.getName());
                    adminListPo.setPhone(po.getPhone());
                    adminListPo.setDoctorCount(String.valueOf(doctorCount));
                    doctorCount = 0;
                    adminListPo.setCreateTime(po.getCreateDate());
                    adminListPo.setSiteName(po.getSiteName());
                    poList.add(adminListPo);
                }
            }
            response.setData(poList);
            return response;
        }
    }

    /**
     * 修改分站管理员
     * @param id
     * @param name
     * @param phone
     * @return
     */
    @Override
    public int modifyAdminUser(String id, String name, String phone) {
        return userMapper.modifyAdminUser(id,name,phone);
    }
}
