package com.fen.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RabbitListener(queues = "msgQueue")
@Component
public class MsgConsumerListener {
    @RabbitHandler
    public void onMessage(String msg) {
        System.out.println("msgQueue:" + msg);
    }
}
