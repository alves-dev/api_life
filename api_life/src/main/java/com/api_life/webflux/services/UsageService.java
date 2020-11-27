package com.api_life.webflux.services;

import com.api_life.webflux.document.Usage;
import com.mongodb.client.result.UpdateResult;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsageService {

	Flux<Usage> findAll();
	Mono<Usage> findById(String Id);
	Mono<UpdateResult> upsert(Usage usage);
}
