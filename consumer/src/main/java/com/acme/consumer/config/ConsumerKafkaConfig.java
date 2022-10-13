package com.acme.consumer.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.Map;

//@EnableKafka
//@Configuration
//public class ConsumerKafkaConfig {
//
//    @Autowired
//    private KafkaProperties kafkaProperties;
//
//    @Bean
//    public DefaultKafkaConsumerFactory<String, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory(Map.of(
//                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers(),
//                ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class,
//                ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class));
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
//        var factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//}
