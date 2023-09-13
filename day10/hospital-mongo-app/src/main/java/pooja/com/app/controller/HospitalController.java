package pooja.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pooja.com.app.Repository.HospitalRepository;
import pooja.com.app.model.Hospital;

import java.util.List;

@Controller
@RequestMapping(value = "/hospital")
public class HospitalController {

    @Autowired
    HospitalRepository hospitalRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Hospital create(@RequestBody Hospital hospital) {
        hospital = hospitalRepository.save(hospital);
        return hospital;
    }
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Hospital> readHospital() {
        return hospitalRepository.findAll();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void modifyByid(@RequestParam String id, @RequestParam String hospitalName) {
        Hospital hospital = hospitalRepository.findByid(id);
        hospital.setHospitalName(hospitalName);
        hospitalRepository.save(hospital);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteByID(@RequestParam String name) {
        hospitalRepository.deleteByname(name);
    }

    @RequestMapping(value = "/findByid", method = RequestMethod.GET)
    public void findByID(@RequestParam String id) {hospitalRepository.findByid(id);
    }

}
