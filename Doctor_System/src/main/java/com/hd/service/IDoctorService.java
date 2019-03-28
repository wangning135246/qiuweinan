package com.hd.service;

import com.hd.entity.response.DoctorListResponse;

public interface IDoctorService {

    DoctorListResponse selectDoctorList(String name);

}
