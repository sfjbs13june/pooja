package com.pooja.app.controller;

import com.pooja.app.model.Hospital;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HospitalController {

     Map<String, Hospital> hospitalMap = new HashMap< String, Hospital>();

    @PostMapping("create/hospital")
    public Hospital createHospital(@RequestBody Hospital hospital){
        hospitalMap.put(hospital.getHospitalName(),hospital);
        return hospital;
    }

    @GetMapping("read/hospital")
    public Hospital readHospital(@RequestParam("hospitalName") String hospitalName){
        return hospitalMap.get(hospitalName);
    }

    @PutMapping("update/hospital")
    public Hospital updateHospital(@RequestParam("hospitalName") String hospitalName,@RequestParam("id") String id){
        Hospital hospital= hospitalMap.get(hospitalName);
        hospital.setId(id);
        hospitalMap.put(hospitalName,hospital);
        return hospital;
    }

    @DeleteMapping("/delete")
    public void deleteHospital(@RequestParam("hospitalName") String hospitalName){
        hospitalMap.remove(hospitalName);
    }
}