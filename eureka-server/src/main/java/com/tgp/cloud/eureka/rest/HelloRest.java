package com.tgp.cloud.eureka.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tgp
 */
@RestController
public class HelloRest {

    @GetMapping("/hi")
    public String hi(){
        return "Hello World!";
    }

}
