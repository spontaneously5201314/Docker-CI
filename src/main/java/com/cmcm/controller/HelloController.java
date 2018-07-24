package com.cmcm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spontaneously
 * @time 2018-07-23 下午8:22
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{word}")
    public String hello(@PathVariable("word") String word) {
        return "Hello " + word;
    }
}
