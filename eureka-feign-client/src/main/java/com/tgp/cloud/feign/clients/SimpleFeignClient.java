package com.tgp.cloud.feign.clients;

import com.tgp.cloud.feign.config.FeignConfig;
import feign.Retryer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author tgp
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface SimpleFeignClient {

    /**
     * 调用eureka-client服务的/hi接口
     * @param name name
     * @return
     */
    @GetMapping(value = "/hi")
    String sayHiFormClientEureka(@RequestParam(value = "name") String name);
}
