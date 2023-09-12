package pooja.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pooja.com.app.Repository.HospitalRepository;
import pooja.com.app.model.Hospital;

@Controller
@RequestMapping(value = "/hospital")
public class HospitalController {

    @Autowired
    HospitalRepository hospitalRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Hospital> getAll() {
        return hospitalRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Hospital hospital) {
        hospitalRepository.save(hospital);
        return "saved";
    }

    @DeleteMapping(value = "/delete")
    public @ResponseBody
    String store(@RequestParam("id") final int id) {
        hospitalRepository.deleteById(id);
        return "deleted";
    }
}
