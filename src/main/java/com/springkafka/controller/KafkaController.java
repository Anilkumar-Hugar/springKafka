package com.springkafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springkafka.producer.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	private KafkaProducer kafkaProducer;

	public KafkaController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@GetMapping("/message")
	public ResponseEntity<String> sendMessage(@RequestParam(name = "message") String msg) {
		kafkaProducer.sendMsg(msg);
		return ResponseEntity.ok("message sent to the topic");
	}
}
