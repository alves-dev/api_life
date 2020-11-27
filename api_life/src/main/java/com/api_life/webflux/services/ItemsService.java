package com.api_life.webflux.services;

import java.util.Map;

import com.api_life.webflux.document.Items;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemsService {
	
	Flux<Items> findAll();
	Mono<Items> findById(String Id);
	Mono<Items> save(Items items);
	Flux<Items> findByParameter(Map<String, String> parameters);
	
}
