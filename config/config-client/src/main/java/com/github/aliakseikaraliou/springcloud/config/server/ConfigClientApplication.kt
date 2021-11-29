package com.github.aliakseikaraliou.springcloud.config.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ConfigClientApplication

fun main() {
    SpringApplication.run(ConfigClientApplication::class.java)
}