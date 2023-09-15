package com.pooja.rabbitmq.service;

import com.pooja.rabbitmq.model.Patient;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSenderPatient {
  @Autowired
  private AmqpTemplate rabbitTemplate;

  @Value("${rabbitmq.exchange.name}")
  private String exchange;

  @Value("${rabbitmq.routingkey.name}")
  private String routingkey;

  public void sendPatient(Patient patient) {
    rabbitTemplate.convertAndSend(exchange, routingkey, patient);
    System.out.println("Send msg = " + patient);

  }

}