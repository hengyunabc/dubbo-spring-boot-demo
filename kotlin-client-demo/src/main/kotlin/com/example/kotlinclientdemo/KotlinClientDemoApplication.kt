package com.example.kotlinclientdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.HelloService;

@SpringBootApplication
class KotlinClientDemoApplication {
    @Reference(version = "1.0.0")
    var demoService: HelloService? = null;

    @PostConstruct
    fun init() {
        val sayHello = demoService!!.sayHello("world")
        System.err.println(sayHello)
    }
}

fun main(args: Array<String>) {
    
    SpringApplication.run(KotlinClientDemoApplication::class.java, *args)
}