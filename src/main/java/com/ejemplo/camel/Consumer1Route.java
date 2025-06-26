package com.ejemplo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Consumer1Route extends RouteBuilder {
    @Override
    public void configure() {
        from("rabbitmq:alert-exchange"
                + "?queue=console.consumer.queue"
                + "&exchangeType=fanout"
                + "&autoDelete=false"
                + "&durable=true"
                + "&declare=true"
                + "&username=guest"
                + "&password=guest")
            .routeId("consumer1")
            .log("📥 [Consumer 1] Mensaje recibido: ${body}");
    }
}
