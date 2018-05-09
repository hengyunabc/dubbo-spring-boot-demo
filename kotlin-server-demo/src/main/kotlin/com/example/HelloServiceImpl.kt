package com.example;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
class HelloServiceImpl : HelloService {

    override fun sayHello(name: String): String {
        return "Hello, " + name + ", " + Date()
    }

}