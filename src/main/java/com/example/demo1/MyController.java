package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Arthur Zhang at 2022/2/15
 */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/foo")
    public String foo() {
        return "hello: " + ConfigService.getSize();
    }
}
