package com.github.aliakseikaraliou.springcloud.eureka.feign.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("cloud-config-client")
interface GreetingService {

    @GetMapping("/greeting")
    fun getGreeting(): String?
}