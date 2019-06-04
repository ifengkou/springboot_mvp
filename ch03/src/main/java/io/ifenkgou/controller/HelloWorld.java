package io.ifenkgou.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @Value("${url.orderUrl}")
    String orderUrl;

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world, " +name;
    }

    @GetMapping("order/url")
    public String getOrderUrl(){
        return orderUrl;
    }
}
