package io.github.sooakim.message.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.kafka.core.KafkaTemplate

class KafkaService @Autowired constructor(
    private val environment: Environment,
    private val kafkaTemplate: KafkaTemplate<String, Any>
){
    private val topic = checkNotNull(environment.getProperty("spring.kafka.template.default-topic")){
        "default topic not set"
    }

    fun emit(data: Any){
        kafkaTemplate.send(topic, data)
    }
}