package com.hd.entity.response;

import com.hd.entity.po.SiteListPo;

import java.util.List;

public class SiteResponse {

    /**
     * 这个封装的前端页面展示所需要的List值
     */
    private List<SiteListPo> data;

    public List<SiteListPo> getData() {
        return data;
    }

    public void setData(List<SiteListPo> data) {
        this.data = data;
    }
}
