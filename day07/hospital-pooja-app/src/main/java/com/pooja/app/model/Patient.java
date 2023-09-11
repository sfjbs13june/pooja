package com.pooja.app.model;

import org.springframework.stereotype.Component;

@Component
public class Patient {

        String patientName;

        String id;

        String hospitalName;

        String disease;

        public Patient(){};

       public Patient(String patientName, String id, String hospitalName, String disease) {
        this.patientName = patientName;
        this.id = id;
        this.hospitalName = hospitalName;
        this.disease = disease;
       }


    public String getPatientName() {
            return patientName;
        }

        public String getId() {
            return id;
        }

        public String getHospitalName() {
            return hospitalName;
        }

        public String getDisease() {
            return disease;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        public void setDisease(String disease) {
            this.disease = disease;
        }

}
