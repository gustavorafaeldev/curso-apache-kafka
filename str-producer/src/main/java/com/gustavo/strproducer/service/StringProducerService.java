package com.gustavo.strproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send message {}", message);
        kafkaTemplate.send("str-topic", message);
//                .addCallback(
//                success -> {
//                    if(success != null) {
//                        log.info("Send message with success {}", message);
//                        log.info("Partition {}, Offset {}",
//                                success.getRecordMetadata().partition(),
//                                success.getRecordMetadata().offset());
//                    }
//                },
//                error -> log.error("Error send message")
//        );
    }
}
