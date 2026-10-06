package com.producerkafka.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producerkafka.test.event.NotificationEvent;
import com.producerkafka.test.service.KafkaProducerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final KafkaProducerService producerService;

    @PostMapping
    public String sendNotification(
            @RequestBody NotificationEvent event) {

        producerService.NotificationEventMethod(event);

        return "Notification event sent!";
    }
}