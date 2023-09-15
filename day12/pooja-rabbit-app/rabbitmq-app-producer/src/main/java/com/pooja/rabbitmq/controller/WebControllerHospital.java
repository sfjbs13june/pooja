package com.pooja.rabbitmq.controller;

import com.pooja.rabbitmq.model.Hospital;
import com.pooja.rabbitmq.service.RabbitMQSenderHospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class WebControllerHospital {
  @Autowired
  RabbitMQSenderHospital rabbitMQSender;

  @GetMapping(value = "producer/hospital")
  public String producerHospital(@RequestParam("hospitalName") String hospitalName, @RequestParam("hospitalId") String hospitalId) {

    Hospital h=new Hospital();
    h.setHospitalId(hospitalId);
    h.setHospitalName(hospitalName);
    rabbitMQSender.sendHospital(h);

    return "Message sent to the RabbitMQ  Successfully";
  }

  @PostMapping(value = "/hospital")
  public String postHospital(@RequestBody Hospital hospital) {

    rabbitMQSender.sendHospital(hospital);

    return "Message sent to the RabbitMQ  Successfully";
  }

}
