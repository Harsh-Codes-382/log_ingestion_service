package io.logsentinel.logsentinel.ingestion.controller;

import io.logsentinel.core.model.LogEvent;
import io.logsentinel.logsentinel.ingestion.service.LogProducerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class LogIngestionController {
    private final LogProducerService producerService;

    @PostMapping
    public ResponseEntity<Void> ingest(@Valid @RequestBody LogEvent event){
        producerService.publish(event);
        return ResponseEntity.accepted().build();
    }
}
