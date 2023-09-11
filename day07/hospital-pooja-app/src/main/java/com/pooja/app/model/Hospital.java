package com.pooja.app.model;

import org.springframework.stereotype.Component;

@Component
public class Hospital {
    String hospitalName;
    String id;
    String address;

    public Hospital(){};

    public Hospital(String hospitalName, String id, String address) {
        this.hospitalName = hospitalName;
        this.id = id;
        this.address = address;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}