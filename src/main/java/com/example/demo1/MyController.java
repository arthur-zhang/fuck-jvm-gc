package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created By Arthur Zhang at 2022/2/15
 */
@RestController
public class MyController {
    private static final String key;

    static char[] chars = new char[300];
    private static byte[] bytes;

    static {
        Arrays.fill(chars, '0');
        key = new String(chars);
        bytes = new byte[1];
    }

    @GetMapping("/hello")
    public String hello() {
        ConfigService.getConfig("user");
        return "hello";
    }

    @GetMapping("/foo")
    public String foo() {
        return "hello: " + ConfigService.getSize();
    }
}
