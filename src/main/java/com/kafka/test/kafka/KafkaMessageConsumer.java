package com.kafka.test.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageConsumer {

    @KafkaListener(topics = "test-topic", groupId = "my-group-id-1")
    public void kafkaListener(String message) {
        System.out.println("This is kafka Consumer - 1");
        System.out.println("The message is: " + message);
    }

    @KafkaListener(topics = "test-topic", groupId = "my-group-id-2")
    public void kafkaListener_1(String message) {
        System.out.println("This is kafka Consumer - 2");
        System.out.println("The message is: " + message);
    }

    @KafkaListener(topics = "test-topic", groupId = "my-group-id-3")
    public void kafkaListener_2(String message) {
        System.out.println("This is kafka Consumer - 3");
        System.out.println("The message is: " + message);
    }

    @KafkaListener(topics = "test-topic", groupId = "my-group-id-4")
    public void kafkaListener_3(String message) {
        System.out.println("This is kafka Consumer - 4");
        System.out.println("The message is: " + message);
    }
}
