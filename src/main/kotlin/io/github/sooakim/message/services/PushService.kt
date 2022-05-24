package io.github.sooakim.message.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.annotation.KafkaListeners
import org.springframework.kafka.core.KafkaTemplate
import java.io.IOException

class PushService @Autowired constructor(
    private val environment: Environment,
    private val kafkaTemplate: KafkaTemplate<String, Any>
){
    @KafkaListener(topics = ["message"], groupId = "message")
    @Throws(IOException::class)
    private fun sendPush(data: Any) {
        sendPush()
    }

    fun sendPush(){

    }

}