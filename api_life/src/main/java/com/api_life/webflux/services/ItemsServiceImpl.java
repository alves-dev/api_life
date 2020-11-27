package com.api_life.webflux.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.api_life.webflux.document.Items;
import com.api_life.webflux.repository.ItemsRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	ItemsRepository ir;
	
	@Autowired
    ReactiveMongoTemplate template;

	@Override
	public Flux<Items> findAll() {
		return ir.findAll();
	}

	@Override
	public Mono<Items> findById(String Id) {
		return ir.findById(Id);
	}

	@Override
	public Mono<Items> save(Items items) {
		return ir.save(items);
	}

	@Override
	public Flux<Items> findByParameter(Map<String, String> parameters) {
		Query query = new Query();
		for (Map.Entry<String, String> entry: parameters.entrySet()) {
			query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
		}
		
		return template.find(query, Items.class);
	}

}
