package com.pooja.app.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/getstudent")

    public String getStudentDetail(){
        return "student1";
    }

    @PutMapping("/updatestudent")

    public String updateStudentDetail(){
        return "updated student1";
    }

    @DeleteMapping("/deletestudent")

    public String deleteStudentDetail(){
        return "deleted student1";
    }

}
