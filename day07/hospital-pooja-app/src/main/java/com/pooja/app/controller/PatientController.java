package com.pooja.app.controller;

import com.pooja.app.model.Hospital;
import com.pooja.app.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PatientController {

    Map<String, Patient> patientMap = new HashMap<String, Patient>();

    @PostMapping("create/patient")
    public Patient createPatient(@RequestBody Patient patient){
        patientMap.put(patient.getPatientName(),patient);
        return patient;
    }

    @GetMapping("read/patient")
    public Patient readHospital(@RequestParam("hospitalName") String hospitalName){
        return patientMap.get(hospitalName);
    }

    @PutMapping("update/patient")
    public Patient updateHospital(@RequestParam("hospitalName") String hospitalName,@RequestParam("id") String id){
        Patient patient= patientMap.get(hospitalName);
        patient.setId(id);
        patientMap.put(hospitalName,patient);
        return patient;
    }

    @DeleteMapping("delete/patient")
    public void deleteHospital(@RequestParam("hospitalName") String hospitalName){
        patientMap.remove(hospitalName);
    }
}
