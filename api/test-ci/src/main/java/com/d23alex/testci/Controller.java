package com.d23alex.testci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private HelloRepository helloRepository;

    public Controller(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GetMapping("/api/all-hellos")
    Iterable<Hello> allHellos() {
        return helloRepository.findAll();
    }
}
