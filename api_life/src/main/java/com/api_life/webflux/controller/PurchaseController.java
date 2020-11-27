package com.api_life.webflux.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api_life.webflux.document.Purchase;
import com.api_life.webflux.services.PurchaseService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class PurchaseController {
	@Autowired
	PurchaseService ps;
	
	@GetMapping(value="/purchase")
	public Flux<Purchase> getItems(){
		return ps.findAll();
	}
	
	@GetMapping(value="/purchase/{id}")
	public Mono<Purchase> getItemsId(@PathVariable String id){
		return ps.findById(id);
	}
	
	
	@PostMapping(value="/purchase")
	public Mono<Purchase> save(@RequestBody Purchase purchase){
		return ps.save(purchase);
	}
	
	@GetMapping(value="/purchase/parameter")
	public Flux<Purchase> getItemsParameter(@RequestBody Map<String, String> parameters){
		return ps.findByParameter(parameters);
	}
}
