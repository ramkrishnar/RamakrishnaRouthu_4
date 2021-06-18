package com.cabbooking.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabbooking.domain.Location;
import com.cabbooking.service.CabService;

@RestController
public class CabController {
	
	@Autowired
	private CabService cabservice;

	@PostMapping(path = "/api/book/")
    public String book(@RequestBody Map<String, Location> booking) {
		return cabservice.book(booking);
	}
}
