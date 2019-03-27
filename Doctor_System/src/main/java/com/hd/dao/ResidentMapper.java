package com.hd.dao;

import org.apache.ibatis.annotations.Param;

public interface ResidentMapper {

    /**
     * 这个方法是将居民表的所有属于该站点的id全都置换成0
     * @param siteid
     * @return
     */
    Integer residentUpdate(@Param("siteid")String siteid);

}
