package com.tgp.cloud.ribbon.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tgp
 */
@Service
@Slf4j
public class RibbonServer {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name , String.class);
    }

    public String hiError(String name) {
        return "sorry, error";
    }
}
