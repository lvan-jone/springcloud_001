package com.order.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping
public class UserController {

    @GetMapping("come")
    public String come() {
        return "come.";
    }
}
