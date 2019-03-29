package com.hd.dao;

import com.hd.entity.po.SiteNameListPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SiteMapper {

    /**
     * 查询站点的名字和创建时间
     * @return
     */
     List<SiteNameListPo> selectSiteNameAndTime(@Param("siteName") String siteName);

    /**
     * 查询站点所有名字的方法
     * @return
     */
    String selectSiteName(@Param("id")Integer id);

    /**
     * 这个是添加站点的方法
     * @param name
     * @return
     */
     int insertSite(@Param("name")String name,@Param("status")Integer status);


    /**
     * 这个是删除站点的方法
     * @param id
     * @return
     */
     Integer deleteSite(@Param("id")Integer id);

    /**
     * 这个是修改站点的方法
     * @param id
     * @param name
     * @return
     */
     Integer modifySite(@Param("id")Integer id,@Param("name")String name,@Param("status")Integer status);

    /**
     * 查询siteID的方法
     * @param name
     * @return
     */
     int selectSiteId(@Param("name")String name);

    /**
     * 查询出所有的站点名字
     * @return
     */
    List<String> selectAllSiteName();
}
