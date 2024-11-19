package com.modsen;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Alexander Dudkin
 */
@Component
public class KafkaListeners {

    @KafkaListener(topics = "thisdudkin", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data + " ^^");
    }

}
