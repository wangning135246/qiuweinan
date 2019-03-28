package com.hd.entity.response;

import com.hd.entity.po.GroupPo;

import java.util.List;

public class GroupResponse {

    List<GroupPo> data;

    public List<GroupPo> getData() {
        return data;
    }

    public void setData(List<GroupPo> data) {
        this.data = data;
    }
}
