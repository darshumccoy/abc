package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ExchangeValue;

public interface ExchangeValueRepository extends 
JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
