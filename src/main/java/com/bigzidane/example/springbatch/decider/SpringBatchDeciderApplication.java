package com.bigzidane.example.springbatch.decider;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchDeciderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBatchDeciderApplication.class, args);
    }
}
