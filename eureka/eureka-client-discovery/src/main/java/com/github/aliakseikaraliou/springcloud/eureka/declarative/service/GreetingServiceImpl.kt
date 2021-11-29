package com.github.aliakseikaraliou.springcloud.eureka.declarative.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class GreetingServiceImpl(
    private val restTemplate: RestTemplate,
) : GreetingService {

    override fun getGreeting() = restTemplate.getForObject<String>("http://cloud-config-client/greeting")
}