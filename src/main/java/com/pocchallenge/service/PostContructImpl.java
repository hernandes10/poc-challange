package com.pocchallenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostContructImpl {

	@Autowired
	PocService pocService;
	public PostContructImpl() {
		System.out.println("PostContructImpl Constructor called");
	}

	@PostConstruct
	public void runAfterObjectCreated() {
		try {
			pocService.initialLoad();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}