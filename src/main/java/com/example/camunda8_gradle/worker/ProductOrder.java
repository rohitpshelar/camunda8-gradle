package com.example.camunda8_gradle.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.Variable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductOrder {

    @JobWorker(type = "productorder", autoComplete = true)
    public Map<String, Object> getProduct() {
        System.out.println("**Service Task Executed**");
        var variable = new HashMap();
        variable.put("productId","100");
        return variable;
    }

    @JobWorker(type = "getproductorder", autoComplete = true)
    public void getproductorder(@Variable String productId) {
        System.out.println("**Service Task Get Product Executed**");
        System.out.println("ProductId = "+productId);
    }


}
