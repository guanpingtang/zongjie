package com.tgp.cloud.feign.rest;

import com.tgp.cloud.feign.server.HiServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tgp
 */
@RestController
public class HiRest {

    @Resource
    private HiServer hiServer;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "feign", required = false) String name) {
        return hiServer.sayHi(name);
    }
}
