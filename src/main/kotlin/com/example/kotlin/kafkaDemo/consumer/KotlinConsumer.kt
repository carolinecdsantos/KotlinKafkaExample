package com.example.kotlin.kafkaDemo.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KotlinConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["simple-message"], groupId = "simple-kotlin-consumer", autoStartup = "\${custom-configs.auto-start:true}")
    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }
}