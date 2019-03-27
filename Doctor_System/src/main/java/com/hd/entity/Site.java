package com.hd.entity;

import java.io.Serializable;

public class Site implements Serializable {
    /**
     * 主键ID
     */
    private int Id;
    /**
     * 站点的名字
     */
    private String name;
    /**
     * 站点的状态，是否开启
     */
    private String status;
    /**
     * 创建时间
     */
    private String createDate;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
