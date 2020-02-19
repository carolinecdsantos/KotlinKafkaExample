package com.example.kotlin.kafkaDemo.controller

import com.example.kotlin.kafkaDemo.producer.KotlinProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/message")
class MessageApiController(private val kotlinProducer: KotlinProducer) {
    
    @PostMapping
    fun sendMessage(@RequestBody message:String) {
        kotlinProducer.send(message)
    }
}