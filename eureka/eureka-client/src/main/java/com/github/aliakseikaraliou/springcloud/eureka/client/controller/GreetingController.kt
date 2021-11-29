package com.github.aliakseikaraliou.springcloud.eureka.client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class GreetingController {
    @Value("\${app.service.name}")
    private val serviceName: String? = null

    /**
     * Returns a greeting message.
     *
     * @return greeting message
     */
    @GetMapping
    fun greeting() = "Hello from $serviceName"
}