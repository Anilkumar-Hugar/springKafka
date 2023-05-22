package com.springkafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.springkafka.entity.Person;

@Component
public class KafkaProducer {
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void sendMsg(Person person) {
		kafkaTemplate.send("java", person);
	}
}
