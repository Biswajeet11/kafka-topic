package com.kafkapractice.kafkapractice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkaExample", groupId = "firstId")
    void listener(String data) {
        System.out.println("after listening: " + data);

    }
}
