package com.hd.entity.po;

import java.io.Serializable;

public class DiseasePo implements Serializable {
    /**
     * 这个是疾病的标签
     */
    private String diseaseLable;
    /**
     * 这个是各个疾病的总和
     */
    private String sum;

    public String getDiseaseLable() {
        return diseaseLable;
    }

    public void setDiseaseLable(String diseaseLable) {
        this.diseaseLable = diseaseLable;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
