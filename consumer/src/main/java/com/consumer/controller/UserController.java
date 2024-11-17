package com.consumer.controller;

import com.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${user.name1}")
    private String username;

    @GetMapping("/come1")
    public String getUser() {
        return userService.come();
    }

    @GetMapping("/come2")
    public String getUser2() {
        return username;
    }
}
