package com.hd.service;

import com.hd.entity.request.addDoctorRequest;
import com.hd.entity.request.addSiteAdminRequest;
import com.hd.entity.response.DoctorListResponse;

public interface IDoctorService {

    DoctorListResponse selectDoctorList(String name);

    public int insertDoctor(addDoctorRequest request);

}
