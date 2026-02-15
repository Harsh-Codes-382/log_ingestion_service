package io.logsentinel.logsentinel.ingestion.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "log.ingestion")
public class LogIngestionProperties {
    private String topic;
    private int partitions;
    private short replicationFactor;
}
