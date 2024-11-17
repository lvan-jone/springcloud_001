package com.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("order")
public interface UserService {

    @GetMapping("/come")
    String come();

}
