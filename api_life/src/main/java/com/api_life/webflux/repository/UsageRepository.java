package com.api_life.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api_life.webflux.document.*;

public interface UsageRepository extends ReactiveMongoRepository<Usage, String>{

}
