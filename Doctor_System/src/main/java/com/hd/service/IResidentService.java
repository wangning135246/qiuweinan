package com.hd.service;

import com.hd.entity.request.AddResidentRequest;
import com.hd.entity.request.ModifyResidentRequest;
import com.hd.entity.response.ResidentResponse;

public interface IResidentService {


    /**
     * 查询居民的方法
     * @param name
     * @return
     */
     ResidentResponse selectResident(String name);

     int insertResident(AddResidentRequest request);

     int modifyResident(ModifyResidentRequest request);
}
