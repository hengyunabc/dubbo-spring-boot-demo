package com.example.kotlinserverdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class KotlinServerDemoApplication {

}

fun main(args: Array<String>) {
    
    // start embedded zookeeper server
    EmbeddedZooKeeper(2181, false).start();

    
    SpringApplication.run(KotlinServerDemoApplication::class.java, *args)
}