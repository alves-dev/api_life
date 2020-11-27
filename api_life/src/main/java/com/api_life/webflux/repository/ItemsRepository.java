package com.api_life.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api_life.webflux.document.Items;

public interface ItemsRepository extends ReactiveMongoRepository<Items, String>{

}
