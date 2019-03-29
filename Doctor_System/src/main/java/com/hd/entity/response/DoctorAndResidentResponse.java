package com.hd.entity.response;

import java.util.List;

public class DoctorAndResidentResponse {
    /**
     * 各医生居民的分配情况
     */
    List<String> dateListResident;
    /**
     * 各站点医生的分配情况
     */
    List<String> dateListDoctor;

    List<String> valueListResident;

    List<String> valueListDoctor;

    public List<String> getDateListResident() {
        return dateListResident;
    }

    public void setDateListResident(List<String> dateListResident) {
        this.dateListResident = dateListResident;
    }

    public List<String> getDateListDoctor() {
        return dateListDoctor;
    }

    public void setDateListDoctor(List<String> dateListDoctor) {
        this.dateListDoctor = dateListDoctor;
    }

    public List<String> getValueListResident() {
        return valueListResident;
    }

    public void setValueListResident(List<String> valueListResident) {
        this.valueListResident = valueListResident;
    }

    public List<String> getValueListDoctor() {
        return valueListDoctor;
    }

    public void setValueListDoctor(List<String> valueListDoctor) {
        this.valueListDoctor = valueListDoctor;
    }
}
