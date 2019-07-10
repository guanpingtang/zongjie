package com.tgp.cloud.feign.server;

import com.tgp.cloud.feign.clients.SimpleFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tgp
 */
@Service
@Slf4j
public class HiServer {

    @Resource
    private SimpleFeignClient simpleFeignClient;

    public String sayHi(String name) {
        return simpleFeignClient.sayHiFormClientEureka(name);
    }
}
