package com.data.handler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class HandlerApplication

fun main(args: Array<String>) {
    runApplication<HandlerApplication>(*args)
}
