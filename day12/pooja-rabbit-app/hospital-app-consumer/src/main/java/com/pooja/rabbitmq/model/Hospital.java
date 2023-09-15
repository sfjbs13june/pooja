package com.pooja.rabbitmq.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Hospital.class)
public class Hospital {

    private String hospitalName;
    private String hospitalId;

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "Hospital [hospitalName=" + hospitalName + ", hospitalId=" + hospitalId + "]";
    }
}
