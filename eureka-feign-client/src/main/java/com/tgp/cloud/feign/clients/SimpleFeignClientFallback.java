package com.tgp.cloud.feign.clients;

import org.springframework.stereotype.Service;

/**
 * SimpleFeignClient的方法调用其他服务快速失败后的补救措施
 * @author tgp
 */
@Service
public class SimpleFeignClientFallback implements SimpleFeignClient {

    /**
     * 调用eureka-client服务的/hi接口
     *
     * @param name name
     * @return
     */
    @Override
    public String sayHiFormClientEureka(String name) {
        return "simple error";
    }
}
