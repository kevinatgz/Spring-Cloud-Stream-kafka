package com.dy.stream.entiy;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(ExampleBinder.class)
public class ExampleReceiver {


    @StreamListener(ExampleBinder.NAME)
    public void recieveText(String payload) {
        System.out.println(payload);
    }
}
