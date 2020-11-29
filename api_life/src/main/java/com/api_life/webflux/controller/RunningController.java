package com.api_life.webflux.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class RunningController {

	@GetMapping(value="/running")
	public String status(){
		return "running";
	}
}
