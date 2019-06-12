package com.zan.hu.user.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-05-26 11:03
 * @Description todo
 **/
@Component
@EnableBinding(Sink.class)
public class MessageListener {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.err.println("【*** 消息接收 ***】" + message.getPayload());
    }
}
