package com.gustavo.strconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class StrConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrConsumerApplication.class, args);
    }
}
