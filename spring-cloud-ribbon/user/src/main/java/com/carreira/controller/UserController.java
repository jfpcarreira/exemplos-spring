package com.carreira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.carreira.config.SayHelloConfig;

@RestController
@RibbonClient(name = "say-hello", configuration = SayHelloConfig.class)
public class UserController {

    @Value("${services.rest.greeting.url}")
    private String greetingServiceUrl;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "Artaban") String name) {
        String greeting = this.restTemplate.getForObject(greetingServiceUrl, String.class);
        return String.format("%s, %s!", greeting, name);
    }

}
