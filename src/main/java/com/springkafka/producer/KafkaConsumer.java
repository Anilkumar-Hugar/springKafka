package com.springkafka.producer;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.springkafka.entity.Person;

@Component
public class KafkaConsumer {
	@KafkaListener(topics = "java",groupId = "javagroup")
	public List<Person> recieveMessage(@Payload List<Person> person) {
		//JsonNode data = new ObjectMapper().readTree(person);
		System.out.println("Message received is: "+person);
		return person;
	}
	
}
