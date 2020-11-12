package com.api_life.webflux.services;

import com.api_life.webflux.document.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsageService {

	Flux<Usage> findAll();
	Mono<Usage> findById(String Id);
	Mono<Usage> save(Usage usage);
	
}
