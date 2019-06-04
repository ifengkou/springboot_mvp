package io.ifenkgou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world, " +name;
    }
}
