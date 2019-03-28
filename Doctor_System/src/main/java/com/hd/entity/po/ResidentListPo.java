package com.hd.entity.po;

import java.io.Serializable;

public class ResidentListPo implements Serializable {

    /**
     * 居民的id
     */
    private Integer id;
    /**
     * 居民的名字
     */
    private String residentName;
    /**
     * 最后的测量时间
     */
    private String createTime;
    /**
     * 居民的电话
     */
    private String phone;
    /**
     * 站点的名字
     */
    private String siteName;
    /**
     * 小组的组长名字
     */
    private String doctorName;
    /**
     * 疾病的标签
     */
    private String  diseaseLable;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
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
