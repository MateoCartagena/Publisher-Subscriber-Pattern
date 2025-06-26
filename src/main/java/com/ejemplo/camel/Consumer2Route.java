package com.ejemplo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Consumer2Route extends RouteBuilder {
    @Override
    public void configure() {
        from("rabbitmq:alert-exchange"
                + "?queue=email.consumer.queue"
                + "&exchangeType=fanout"
                + "&autoDelete=false"
                + "&durable=true"
                + "&declare=true"
                + "&username=guest"
                + "&password=guest")
            .routeId("consumer2")
            .log("📨 [Consumer 2] Simulando envío por email: ${body}");
    }
}
