package com.hd.service;

import com.hd.entity.response.DoctorAndResidentResponse;
import com.hd.entity.response.ResidentDiseaseResponse;

public interface IDiseaseService {

    /**
     * 疾病的折线图
     * @return
     */
    ResidentDiseaseResponse selectDisease();

    /**
     * 医生和病人的分析折线图
     * @return
     */
    DoctorAndResidentResponse selectDoctorAndResident();

}
