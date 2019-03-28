package com.hd.entity.request;

import java.io.Serializable;

public class addSiteAdminRequest implements Serializable {

    private String siteName;

    private String siteAdminAccount;

    private String password;

    private String phone;

    private String siteNames;

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

    public String getSiteNames() {
        return siteNames;
    }

    public void setSiteNames(String siteNames) {
        this.siteNames = siteNames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
