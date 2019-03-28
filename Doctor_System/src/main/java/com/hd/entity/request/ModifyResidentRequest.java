package com.hd.entity.request;

import java.io.Serializable;

public class ModifyResidentRequest implements Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 名字
     */
    private String residentName;
    /**
     *电话
     */
    private String phone;
    /**
     * 站点的ID
     */
    private String siteName;
    /**
     * 医生的Id
     */
    private String doctorName;
    /**
     * 疾病的标签
     */
    private String diseaseLable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDiseaseLable() {
        return diseaseLable;
    }

    public void setDiseaseLable(String diseaseLable) {
        this.diseaseLable = diseaseLable;
    }
}
