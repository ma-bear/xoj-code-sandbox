package com.example.xojcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xq
 * @create 2024/4/5 10:15
 */
@RestController
public class MainController {

    @GetMapping ("/health")
    public String test(){
        return "ok";
    }
}
