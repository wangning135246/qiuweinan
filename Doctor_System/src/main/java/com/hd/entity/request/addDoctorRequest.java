package com.hd.entity.request;

import java.io.Serializable;

public class addDoctorRequest implements Serializable {

    /**
     * 管理者的姓名
     */
    private String doctorName;
    /**
     * 管理者的账号
     */
    private String siteAdminAccount;
    /**
     * 管理者的密码
     */
    private String password;
    /**
     * 电话
     */
    private String phone;
    /**
     * 分站的名称
     */
    private String siteName;
    /**
     * 管理者的地址
     */
    private String address;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteAdminAccount() {
        return siteAdminAccount;
    }

    public void setSiteAdminAccount(String siteAdminAccount) {
        this.siteAdminAccount = siteAdminAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
