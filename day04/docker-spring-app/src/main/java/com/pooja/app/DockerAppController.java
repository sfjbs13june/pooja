package com.pooja.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAppController {

    @GetMapping("/name")
    public String name(){
        return "Pooja";
    }



    @GetMapping("/age")
    public int age(){
        return 24;    }



    @GetMapping("/address")
    public String address(){
        return "Pune";
    }


}
