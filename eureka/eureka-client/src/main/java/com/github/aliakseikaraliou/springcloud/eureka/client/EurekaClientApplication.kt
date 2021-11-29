package com.github.aliakseikaraliou.springcloud.eureka.client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
class EurekaClientApplication

fun main(){
    SpringApplication.run(EurekaClientApplication::class.java)
}