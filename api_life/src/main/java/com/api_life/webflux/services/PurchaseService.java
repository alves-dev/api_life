package com.api_life.webflux.services;

import java.util.Map;

import com.api_life.webflux.document.Purchase;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurchaseService {

	Flux<Purchase> findAll();
	Mono<Purchase> findById(String Id);
	Mono<Purchase> save(Purchase purchase);
	Flux<Purchase> findByParameter(Map<String, String> parameters);
}
