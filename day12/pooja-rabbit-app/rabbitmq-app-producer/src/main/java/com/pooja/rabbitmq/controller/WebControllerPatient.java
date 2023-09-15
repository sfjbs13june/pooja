package com.pooja.rabbitmq.controller;

import com.pooja.rabbitmq.model.Patient;
import com.pooja.rabbitmq.service.RabbitMQSenderHospital;
import com.pooja.rabbitmq.service.RabbitMQSenderPatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class WebControllerPatient {
  @Autowired
  RabbitMQSenderPatient rabbitMQSender;

    @GetMapping(value = "producer/patient")
    public String producerPatient(@RequestParam("patientName") String patientName, @RequestParam("patientId") String patientId) {

      Patient p=new Patient();
      p.setPatientId(patientId);
      p.setPatientName(patientName);
      rabbitMQSender.sendPatient(p);

    return "Message sent to the RabbitMQ  Successfully";
  }

  @PostMapping(value = "/patient")
  public String postPatient(@RequestBody Patient p) {

    rabbitMQSender.sendPatient(p);

    return "Message sent to the RabbitMQ  Successfully";
  }
}
