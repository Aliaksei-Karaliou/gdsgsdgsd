package com.github.aliakseikaraliou.springcloud.eureka.declarative

import com.github.aliakseikaraliou.springcloud.eureka.declarative.service.GreetingService
import org.springframework.beans.factory.getBean
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
class EurekaDiscoveryApplication

fun main() {
    val context = SpringApplicationBuilder(EurekaDiscoveryApplication::class.java)
        .web(WebApplicationType.NONE)
        .run()

    val greetingService = context.getBean<GreetingService>()
    do {
        println(greetingService.getGreeting())
        Thread.sleep(1000)
    } while (true)


}