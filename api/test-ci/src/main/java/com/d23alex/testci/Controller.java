package com.d23alex.testci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api/hello")
    String hello() {
        return "Hello!";
    }
}
