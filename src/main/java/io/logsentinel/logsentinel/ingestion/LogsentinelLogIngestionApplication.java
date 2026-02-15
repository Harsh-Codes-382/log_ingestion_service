package io.logsentinel.logsentinel.ingestion;

import io.logsentinel.logsentinel.ingestion.properties.LogIngestionProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(LogIngestionProperties.class)
public class LogsentinelLogIngestionApplication {

    public static void main(String[] args) {

        SpringApplication.run(LogsentinelLogIngestionApplication.class, args);
    }

}
