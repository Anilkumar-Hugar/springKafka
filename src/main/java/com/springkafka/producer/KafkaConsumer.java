package com.springkafka.producer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "java",groupId = "javagroup")
	public String recieveMessage(String receivedMessage) {
		System.out.println("Message received is: "+receivedMessage);
		return receivedMessage;
	}
	
}
