package com.hd.dao;

import com.hd.entity.Resident;
import com.hd.entity.po.DiseasePo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResidentMapper {

    /**
     * 这个方法是将居民表的所有属于该站点的id全都置换成0
     * @param siteid
     * @return
     */
    Integer residentUpdate(@Param("siteid")Integer siteid);

    /**
     * 查询属于某医生下的居民的数量
     * @param id
     * @return
     */
    int selectResidentCount(@Param("id")String id);

    /**
     * 这个是查询居民的方法
     * @return
     */
    List<Resident> selectResident(@Param("name")String name);

    /**
     * 这个是添加居民的方法
     * @param
     * @return
     */
    int insertResident(@Param("name")String name,@Param("doctorId")String doctorId,@Param("siteId")String siteId,@Param("diseaseLable")String diseaseLable,@Param("phone")String phone);

    /**
     * 修改居民的方法
     * @param
     * @return
     */
    int modifyResident(@Param("id")String id,@Param("name")String name,@Param("doctorId")String doctorId,@Param("siteId")String siteId,@Param("diseaseLable")String diseaseLable,@Param("phone")String phone);

    /**
     * 删除小组的方法
     * @param doctorId
     * @return
     */
    int modifyDoctorId(@Param("doctorid")String doctorId);

    /**
     * 查询疾病标签
     * @return
     */
    List<DiseasePo> selectDisease();

    /**
     * 查询所有的居民
     * @return
     */
    List<Resident> selectAllResident();
}
