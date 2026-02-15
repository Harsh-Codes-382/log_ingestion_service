package io.logsentinel.logsentinel.ingestion.service;

import io.logsentinel.core.model.LogEvent;
import io.logsentinel.logsentinel.ingestion.properties.LogIngestionProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogProducerService {
    private final LogIngestionProperties properties;
    private final KafkaTemplate<String, LogEvent> kafkaTemplate;

    public void publish(LogEvent event) {
        kafkaTemplate.send(
                properties.getTopic(),
                event.getContext().getServiceName(), // partition Key
                event
        );
    }
}
