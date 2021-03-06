package com.sharing.client.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Process {

    private final Logger logger = LoggerFactory.getLogger(Process.class);

    @Autowired
    private SharingClient client;

//    @Autowired
//    private RestTemplate restTemplate;

    @Scheduled(fixedDelay = 1000)
    public void process() {
        logger.info("response '{}'", client.mock());
//        logger.info("response '{}'", restTemplate.getForEntity("http://sharing-service/service", String.class).getBody());
    }
}
