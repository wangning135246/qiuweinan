package com.hd.service;

import com.hd.entity.request.addSiteAdminRequest;
import com.hd.entity.response.SiteListResponse;
import org.apache.ibatis.annotations.Param;

public interface ISiteAdminService {

    /**
     * 查询分站管理员列表
     * @param name
     * @return
     */
    SiteListResponse selectAdminList(String name);

    /**
     * 修改管理员的信息的方法
     * @param id
     * @param name
     * @param phone
     * @return
     */
    int modifyAdminUser(String id,String name,String phone);

     int insertAdminUser(addSiteAdminRequest request);

}
