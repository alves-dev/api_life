package com.api_life.webflux.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api_life.webflux.document.Items;
import com.api_life.webflux.services.ItemsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ItemsController {
	@Autowired
	ItemsService is;
	
	@GetMapping(value="/items")
	public Flux<Items> getItems(){
		return is.findAll();
	}
	
	@GetMapping(value="/items/{id}")
	public Mono<Items> getItemsId(@PathVariable String id){
		return is.findById(id);
	}
	
	
	@PostMapping(value="/items")
	public Mono<Items> save(@RequestBody Items items){
		return is.save(items);
	}
	
	@GetMapping(value="/items/parameter")
	public Flux<Items> getItemsParameter(@RequestBody Map<String, String> parameters){
		return is.findByParameter(parameters);
	}
}
