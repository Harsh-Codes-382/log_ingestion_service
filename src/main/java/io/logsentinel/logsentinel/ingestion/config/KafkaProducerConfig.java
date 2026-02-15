package io.logsentinel.logsentinel.ingestion.config;

import io.logsentinel.core.model.LogEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public KafkaTemplate<String, LogEvent> kafkaTemplate(org.springframework.kafka.core.ProducerFactory<String, LogEvent> producerFactory){
        return new KafkaTemplate<>(producerFactory);
    }

}
