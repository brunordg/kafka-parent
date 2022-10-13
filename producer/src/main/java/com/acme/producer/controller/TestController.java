package com.acme.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@RestController
public class TestController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send")
    public ResponseEntity<?> send() {

        IntStream.range(1, 1000000)
                .boxed()
                .forEach(n -> kafkaTemplate.send("topic-3", "Envio de: " + LocalDateTime.now() + ": " + n));

        return ResponseEntity.ok().build();
    }

}
