package com.hd.entity;

import java.io.Serializable;

public class Resident implements Serializable {

    /**
     * 主键ID
     */
    private int Id;
    /**
     * 居民的名字
     */
    private String name;
    /**
     * 居民的手机号
     */
    private String phone;
    /**
     * 分站的ID
     */
    private int siteId;
    /**
     * 医生的ID
     */
    private int doctorId;
    /**
     * 分站管理员的ID
     */
    private int adminId;
    /**
     * 疾病的标签
     */
    private String diseaselable;
    /**
     * 最后一次的检查时间
     */
    private String measuringTime;
    /**
     * 创建时间
     */
    private String createDate;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getDiseaselable() {
        return diseaselable;
    }

    public void setDiseaselable(String diseaselable) {
        this.diseaselable = diseaselable;
    }

    public String getMeasuringTime() {
        return measuringTime;
    }

    public void setMeasuringTime(String measuringTime) {
        this.measuringTime = measuringTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
