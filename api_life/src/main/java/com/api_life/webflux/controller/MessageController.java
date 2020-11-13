package com.api_life.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api_life.webflux.document.Message;
import com.api_life.webflux.services.MessageService;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class MessageController {

	@Autowired
	MessageService ms;
	
	@GetMapping(value="/message")
	public Flux<Message> getUsage(){
		return ms.findAll();
	}
	
	@GetMapping(value="/message/{id}")
	public Mono<Message> getUsageId(@PathVariable String id){
		return ms.findById(id);
	}
	
	@PostMapping(value="/message")
	public Mono<Message> save(@RequestBody Message m){
		return ms.save(m);
	}
	
}
