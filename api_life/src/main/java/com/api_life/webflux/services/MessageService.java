package com.api_life.webflux.services;

import com.api_life.webflux.document.Message;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessageService {
	
	Flux<Message> findAll();
	Mono<Message> findById(String Id);
	Mono<Message> save(Message message);

}
