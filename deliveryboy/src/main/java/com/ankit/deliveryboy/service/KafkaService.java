package com.ankit.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ankit.deliveryboy.config.AppaConstants;

@Service
public class KafkaService {

	private Logger logger = LoggerFactory.getLogger(KafkaService.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppaConstants.LOCATION_TOPIC_NAME, location);
		this.logger.info("Message Produces");
		return true;
	}
}
