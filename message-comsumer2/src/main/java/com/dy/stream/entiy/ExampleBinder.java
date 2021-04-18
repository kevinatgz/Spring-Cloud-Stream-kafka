package com.dy.stream.entiy;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface  ExampleBinder
{

    String NAME = "packetUplinkInput";

    @Input(NAME)
    SubscribableChannel input();
}