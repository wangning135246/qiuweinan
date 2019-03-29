package com.hd.entity.response;

import java.util.List;

public class ResidentDiseaseResponse {
    /**
     * 这个是疾病的X轴
     */
    List<String> dateList;
    /**
     * 这个是患病的数量
     */
    List<String> valueList;

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }
}
