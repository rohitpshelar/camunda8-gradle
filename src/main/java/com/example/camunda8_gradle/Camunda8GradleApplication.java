package com.example.camunda8_gradle;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = "classpath*:*.bpmn")
//@Deployment(resources = "classpath:sample.bpmn")
public class Camunda8GradleApplication {

	@Autowired
	private ZeebeClient client;

	public static void main(String[] args) {
		SpringApplication.run(Camunda8GradleApplication.class, args);
	}

}
