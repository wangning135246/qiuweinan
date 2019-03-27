package com.hd.service;

import com.hd.entity.request.siteRequest;
import com.hd.entity.response.SiteResponse;


public interface ISiteService {

    /**
     * 查询站点下的站点管理员和医生
     * @return
     */
    SiteResponse selectSiteCount(String siteName);

    /**
     * 这个是添加站点的方法
     * @param request
     * @return
     */
    int insertSite(siteRequest request);

    /**
     *这个是删除站点的方法
     * @param id
     * @return
     */
    Integer deleteSite(Integer id);

    /**
     * 这个是修改站点的方法
     * @param id
     * @param name
     * @return
     */
    Integer modifySite(Integer id,String name,Integer status);
}
