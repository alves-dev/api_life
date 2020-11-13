package com.api_life.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api_life.webflux.document.Message;

public interface MessageRepository extends ReactiveMongoRepository<Message, String>{

}
