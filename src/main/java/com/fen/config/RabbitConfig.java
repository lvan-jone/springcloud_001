package com.fen.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    //定义交换机
    @Bean
    FanoutExchange fanoutExchange() {
        //三个参数分别为 交换机名 是否持久化 是否自动删除
        return new FanoutExchange("fanoutExchange", true, false);
    }

    //定义队列
    @Bean
    Queue emailQueue() {
        //两个参数分别为 队列名 是否持久化
        return new Queue("emailQueue", true);
    }

    @Bean
    Queue msgQueue() {
        return new Queue("msgQueue", true);
    }

    @Bean
    Queue orderQueue() {
        return new Queue("orderQueue", true);
    }

    /**
     * 绑定队列和交换机
     *
     * @return 绑定关系
     */
    @Bean
    Binding emailBinding() {
        return BindingBuilder.bind(emailQueue()).to(fanoutExchange());
    }

    @Bean
    Binding msgBinding() {
        return BindingBuilder.bind(msgQueue()).to(fanoutExchange());
    }

    @Bean
    Binding orderBinding() {
        return BindingBuilder.bind(orderQueue()).to(fanoutExchange());
    }

}
