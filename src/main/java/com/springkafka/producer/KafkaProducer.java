package com.springkafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	static Logger logger=LoggerFactory.getLogger(KafkaProducer.class);
	private KafkaTemplate<String, String> kafkaTemplate;

	KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMsg(String msg) {
		logger.info("message sent");
		kafkaTemplate.send("newTopic", msg);
	}
}
