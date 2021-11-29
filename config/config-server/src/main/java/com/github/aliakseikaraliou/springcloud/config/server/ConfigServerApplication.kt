package com.github.aliakseikaraliou.springcloud.config.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigServerApplication

fun main() {
    SpringApplication.run(ConfigServerApplication::class.java)
}