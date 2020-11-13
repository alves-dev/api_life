package com.api_life.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_life.webflux.document.Usage;
import com.api_life.webflux.repository.UsageRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsageServiceImpl implements UsageService{
	
	@Autowired
	UsageRepository ur;

	@Override
	public Flux<Usage> findAll() {
		return ur.findAll();
	}

	@Override
	public Mono<Usage> findById(String Id) {
		return ur.findById(Id);
	}

	@Override
	public Mono<Usage> save(Usage usage) {
		return ur.save(usage);
	}

}
