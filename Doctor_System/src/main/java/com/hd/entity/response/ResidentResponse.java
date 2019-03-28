package com.hd.entity.response;

import com.hd.entity.po.ResidentListPo;

import java.util.List;

public class ResidentResponse {

    List<ResidentListPo> data;

    public List<ResidentListPo> getData() {
        return data;
    }

    public void setData(List<ResidentListPo> data) {
        this.data = data;
    }
}
