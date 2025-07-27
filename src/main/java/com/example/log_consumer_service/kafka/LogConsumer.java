package com.example.log_consumer_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumer {

    @KafkaListener(topics = "order-logs", groupId = "log-consumer-group")
    public void consumeOrderLog(String message) {
        System.out.println("Received order log: " + message);
    }

    @KafkaListener(topics = "product-logs", groupId = "log-consumer-group")
    public void consumeProductLog(String message) {
        System.out.println("Received product log: " + message);
    }
}
