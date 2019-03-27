package com.hd.entity.po;

import java.io.Serializable;

public class SiteAdminListPo implements Serializable {

    /**
     * 分站管理员的id
     */
    private Integer id;
    /**
     * 分站管理员的账号
     */
    private String account;
    /**
     * 分站管理员的名字
     */
    private String adminName;
    /**
     * 分站管理员的电话
     */
    private String phone;
    /**
     * 管辖的医生的数量
     */
    private String doctorCount;
    /**
     * 创建的时间
     */
    private String createTime;
    /**
     * 管辖的站点的名字
     */
    private String siteName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(String doctorCount) {
        this.doctorCount = doctorCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
}
