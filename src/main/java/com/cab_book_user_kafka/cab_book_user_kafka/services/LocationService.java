package com.cab_book_user_kafka.cab_book_user_kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	    @KafkaListener(topics = "DriverLocation", groupId = "user-group")
	    public void cabLocation(String location) {
	        System.out.println(location);
	    }
}
