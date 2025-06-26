package com.ejemplo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PublisherRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:alerta?period=15000")
            .setBody().simple("🚨 Alerta generada: ${date:now:yyyy-MM-dd HH:mm:ss}")
            .setHeader("rabbitmq.DELIVERY_MODE", constant(2))
            .log("📡 Publicando mensaje: ${body}")
            .to("rabbitmq:alert-exchange"
                + "?exchangeType=fanout"
                + "&autoDelete=false"
                + "&durable=true"
                + "&declare=false"
                + "&username=guest"
                + "&password=guest"
                + "&publisherAcknowledgements=true");
    }
}
