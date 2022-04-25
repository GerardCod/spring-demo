package com.ibm.academia.springdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RamiroControlador {
	
	@GetMapping("/ramiro")
	public ResponseEntity<String> ramiro(){
		
		return ResponseEntity.ok("Ramiro");
	}

}
