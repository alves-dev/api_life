package com.api_life.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_life.webflux.document.Message;
import com.api_life.webflux.repository.MessageRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	MessageRepository mr;

	@Override
	public Flux<Message> findAll() {
		return mr.findAll();
	}

	@Override
	public Mono<Message> findById(String Id) {
		return mr.findById(Id);
	}

	@Override
	public Mono<Message> save(Message message) {
		return mr.save(message);
	}

}
