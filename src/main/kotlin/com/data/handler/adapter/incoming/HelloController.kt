package com.data.handler.adapter.incoming

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
        private val helloService: HelloService){
    @GetMapping("/hello")
    fun hello() = helloService.hello()
}
