package io.github.sooakim.message.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment

class MessageService @Autowired constructor(
    private val kafkaService: KafkaService
){

}