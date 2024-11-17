//package com.fen.service;
//
//import com.fen.entity.User;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@Service
//@Slf4j
//public class ProductQueueService {
//    @Autowired
//    public RabbitTemplate rabbitTemplate;
//
//    public void sendMsg(User user) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time = simpleDateFormat.format(new Date());
//        String msg = "productQueue-" + time + ":hello, " + user.getUsername();
//        rabbitTemplate.convertAndSend("fanoutExchange", "", msg);
//        log.info("send msg");
//    }
//}
