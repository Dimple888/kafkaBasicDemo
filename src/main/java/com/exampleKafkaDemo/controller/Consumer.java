package com.exampleKafkaDemo.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "demo_topic",groupId = "demo_group")
	public void listenToTopic(String message) {
		System.out.println("The message received is: "+ message);
	}

}
