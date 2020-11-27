package com.api_life.webflux.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.api_life.webflux.document.Purchase;
import com.api_life.webflux.repository.PurchaseRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	@Autowired
	PurchaseRepository pr;
	
	@Autowired
    ReactiveMongoTemplate template;

	@Override
	public Flux<Purchase> findAll() {
		return pr.findAll();
	}

	@Override
	public Mono<Purchase> findById(String Id) {
		return pr.findById(Id);
	}

	@Override
	public Mono<Purchase> save(Purchase purchase) {
		return pr.save(purchase);
	}

	@Override
	public Flux<Purchase> findByParameter(Map<String, String> parameters) {
		Query query = new Query();
		for (Map.Entry<String, String> entry: parameters.entrySet()) {
			query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
		}
		
		return template.find(query, Purchase.class);
	}

}
