package com.data.handler.adapter.incoming

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class HelloService {
    fun hello() = Mono.just("Hello Webflux with Kotlin").log()
}