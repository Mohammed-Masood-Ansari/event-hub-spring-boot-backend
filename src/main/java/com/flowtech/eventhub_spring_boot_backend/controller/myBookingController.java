package com.flowtech.eventhub_spring_boot_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myBooking")
public class myBookingController {

	@GetMapping(value = "/getMybooking")
	public String getMybooking() {
		return "booking done"; 	
	}
}
