package com.modsen.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Alexander Dudkin
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic alexTopic() {
        return TopicBuilder.name("thisdudkin")
                .build();
    }

}
