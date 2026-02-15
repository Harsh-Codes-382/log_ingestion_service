package io.logsentinel.logsentinel.ingestion.config;

import io.logsentinel.logsentinel.ingestion.properties.LogIngestionProperties;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@RequiredArgsConstructor
public class KafkaTopicConfig {
    private final LogIngestionProperties properties;

    @Bean
    public NewTopic logsRawTopic(){
        return TopicBuilder
                .name(properties.getTopic())
                .partitions(properties.getPartitions())
                .replicas(properties.getReplicationFactor())
                .build();
    }
}
