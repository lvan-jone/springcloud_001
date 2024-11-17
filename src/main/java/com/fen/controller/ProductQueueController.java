//package com.fen.controller;
//
//import com.fen.entity.User;
//import com.fen.service.ProductQueueService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/productQueue")
//@Slf4j
//public class ProductQueueController {
//
//    @Autowired
//    private ProductQueueService productQueueService;
//
//    @GetMapping
//    public void sendMsg(User user) {
//        productQueueService.sendMsg(user);
//        log.info("发送消息");
//    }
//}
