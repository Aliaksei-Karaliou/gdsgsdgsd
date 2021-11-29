package com.github.aliakseikaraliou.springcloud.eureka.declarative.config

import com.netflix.loadbalancer.*
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.netflix.ribbon.RibbonClients
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@RibbonClients(
    RibbonClient(
        name = "cloud-config-client",
        configuration = [RibbonConfiguration::class]
    )
)
class RibbonConfiguration {
    @Bean
    @LoadBalanced
    fun restTemplate(): RestTemplate = RestTemplate()

    @Bean
    fun eurekaRule(): IRule = WeightedResponseTimeRule()
}
