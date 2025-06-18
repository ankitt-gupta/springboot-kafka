package com.ankit.deliveryboy.locationController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.deliveryboy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private KafkaService kafkaService;

	@PostMapping("/update")
	public ResponseEntity<?> updateLocation() {
		this.kafkaService.updateLocation("[ " + (Math.random() + 50) + " ]");
		return new ResponseEntity<>(Map.of("message", "location updated"), HttpStatus.OK);
	}

}
