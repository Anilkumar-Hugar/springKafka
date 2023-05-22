package com.springkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springkafka.entity.Person;
import com.springkafka.producer.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
	private KafkaProducer kafkaProducer;

	@PostMapping("/send")
	public ResponseEntity<String> sendMessage(@RequestBody Person person) {
		kafkaProducer.sendMsg(person);
		return ResponseEntity.ok("message sent to the topic");
	}
}
