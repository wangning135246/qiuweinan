package com.hd.entity.po;

import java.io.Serializable;

public class DoctorListPo implements Serializable {

    /**
     * 医生的id
     */
    private Integer id;
    /**
     * 医生的账号
     */
    private String account;
    /**
     * 医生的名字
     */
    private String doctorName;
    /**
     * 分站管理员的电话
     */
    private String phone;
    /**
     * 管辖的居民的数量
     */
    private String residentCount;
    /**
     * 创建的时间
     */
    private String createTime;

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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getResidentCount() {
        return residentCount;
    }

    public void setResidentCount(String residentCount) {
        this.residentCount = residentCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
