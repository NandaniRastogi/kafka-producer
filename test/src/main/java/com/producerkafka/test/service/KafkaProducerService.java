package com.producerkafka.test.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.producerkafka.test.event.NotificationEvent;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, NotificationEvent> kafkaTemplate;

    public void NotificationEventMethod(NotificationEvent notificationEvent) {

      kafkaTemplate.send("notification-topic-v2", notificationEvent);

        System.out.println("Event sent to the kafka" + notificationEvent.getMessage());

    }

}
