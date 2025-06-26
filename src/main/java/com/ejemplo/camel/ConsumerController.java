package com.ejemplo.camel;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private CamelContext camelContext;

    @GetMapping("/pause/{routeId}")
    public String pauseConsumer(@PathVariable String routeId) throws Exception {
        camelContext.getRouteController().stopRoute(routeId);
        return "Route " + routeId + " paused.";
    }

    @GetMapping("/resume/{routeId}")
    public String resumeConsumer(@PathVariable String routeId) throws Exception {
        camelContext.getRouteController().startRoute(routeId);
        return "Route " + routeId + " resumed.";
    }
}