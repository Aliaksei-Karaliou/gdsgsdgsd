package com.github.aliakseikaraliou.springcloud.eureka.config.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
class EurekaConfigServerApplication

fun main() {
    SpringApplication.run(EurekaConfigServerApplication::class.java)
}