package com.hd.entity.response;

import com.hd.entity.po.DoctorListPo;

import java.util.List;

public class DoctorListResponse {

    List<DoctorListPo> data;

    public List<DoctorListPo> getData() {
        return data;
    }

    public void setData(List<DoctorListPo> data) {
        this.data = data;
    }
}
