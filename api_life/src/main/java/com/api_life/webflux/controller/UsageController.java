package com.api_life.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api_life.webflux.document.Usage;
import com.api_life.webflux.services.UsageService;
import com.mongodb.client.result.UpdateResult;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class UsageController {
	
	@Autowired
	UsageService us;
	
	@GetMapping(value="/usage")
	public Flux<Usage> getUsage(){
		return us.findAll();
	}
	
	@GetMapping(value="/usage/{id}")
	public Mono<Usage> getUsageId(@PathVariable String id){
		return us.findById(id);
	}
	
	
	@PostMapping(value="/usage")
	public Mono<UpdateResult> upsert(@RequestBody Usage usage){
		return us.upsert(usage);
	}
	
}
