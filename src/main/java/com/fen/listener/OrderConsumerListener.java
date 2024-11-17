package com.fen.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RabbitListener(queues = "orderQueue")
@Component
public class OrderConsumerListener {
    @RabbitHandler
    public void onMessage(String msg) {
        System.out.println("订单队列监听器接收到消息：" + msg);
    }
}
