package com.hd.entity.request;

import java.io.Serializable;

public class siteRequest implements Serializable {
    /**
     * 站点名称
     */
    private String name;
    /**
     * 站点的管理员
     */
    private String siteAdmin;
    /**
     * 该站点分配的医生
     */
    private String doctorName;
    /**
     * 该站点的状态
     */
    private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(String siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
