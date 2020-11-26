package com.api_life.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.api_life.webflux.document.Usage;
import com.api_life.webflux.repository.UsageRepository;
import com.mongodb.client.result.UpdateResult;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsageServiceImpl implements UsageService{
	
	@Autowired
	UsageRepository ur;
	
	@Autowired
    ReactiveMongoTemplate template;

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
	
	@Override
	public Mono<UpdateResult> upsert(Usage usage) {
		//return ur.save(usage);
		Query query = new Query();
		query.addCriteria(Criteria.where("date").is(usage.getDate()));
		
		Update up = new Update();
		up.set("minutes", usage.getMinutes());
		up.set("checks", usage.getChecks());
		
		return template.upsert(query, up, Usage.class);
	}

}
