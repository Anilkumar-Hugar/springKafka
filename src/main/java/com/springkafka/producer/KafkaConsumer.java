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
		System.out.println("Message received is: "+person);
		return person;
	}
	@KafkaListener(topics = "java",groupId ="javagroup1")
	public List<Person> receivedMessage(@Payload List<Person> person){
		System.out.println("message received to 2nd consumer is: "+person);
		return person;
	}
}
