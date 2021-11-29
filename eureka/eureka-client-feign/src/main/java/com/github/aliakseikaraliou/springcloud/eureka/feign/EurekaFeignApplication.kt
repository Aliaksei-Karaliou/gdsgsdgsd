package com.github.aliakseikaraliou.springcloud.eureka.feign

import com.github.aliakseikaraliou.springcloud.eureka.feign.service.GreetingService
import org.springframework.beans.factory.getBean
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
class EurekaFeignApplication

fun main() {
    val context = SpringApplicationBuilder(EurekaFeignApplication::class.java)
        .web(WebApplicationType.NONE)
        .run()

    val greetingService = context.getBean<GreetingService>()
    do {
        println(greetingService.getGreeting())
        Thread.sleep(1000)
    } while (true)
}