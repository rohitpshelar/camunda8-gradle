package com.example.camunda8_gradle.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class ProductOrder {

    @JobWorker(type = "productorder", autoComplete = true)
    public void getProduct() {
        System.out.println("**Service Task Executed**");
    }
}
