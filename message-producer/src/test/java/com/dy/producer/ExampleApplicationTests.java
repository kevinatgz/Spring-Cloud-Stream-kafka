package com.dy.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith
        (
                SpringRunner
                        .
                        class
        )
@EnableBinding
        (value = {
                ExampleApplicationTests
                        .
                        ExampleBinder
                        .
                        class
        })
public class ExampleApplicationTests {

    @Autowired
    private ExampleBinder exampleBinder;

    /**
     * 测试发消息
     */
    @Test
    public void exampleBinderTester() {
        exampleBinder.output().send(
                MessageBuilder
                        .withPayload(
                                "Produce a message from : http://blog.didispace.com"
                        ).build());
    }


    public interface ExampleBinder {
        String NAME = "baeldung";
        @Output(NAME)
        MessageChannel output();
    }
}
