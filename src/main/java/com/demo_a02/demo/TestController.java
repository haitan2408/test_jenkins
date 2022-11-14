package com.demo_a02.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("hello")
    public String helloWorld() {
        return "hello";
    }
}
