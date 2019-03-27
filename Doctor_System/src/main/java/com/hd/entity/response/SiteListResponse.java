package com.hd.entity.response;

import com.hd.entity.po.SiteAdminListPo;

import java.util.List;

public class SiteListResponse {

    List<SiteAdminListPo> data;

    public List<SiteAdminListPo> getData() {
        return data;
    }

    public void setData(List<SiteAdminListPo> data) {
        this.data = data;
    }
}
