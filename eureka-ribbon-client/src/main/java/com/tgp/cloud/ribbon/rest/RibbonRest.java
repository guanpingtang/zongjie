package com.tgp.cloud.ribbon.rest;

import com.tgp.cloud.ribbon.server.RibbonServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tgp
 */
@RestController
public class RibbonRest {

    @Resource
    private RibbonServer ribbonServer;

    @GetMapping("")
    public String hi(@RequestParam("name") String name) {
        return ribbonServer.hi(name);
    }
}
