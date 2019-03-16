package com.bm.feignconsumer.service;

import com.bm.notaryserviceapi.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "notary-service")
public interface RefactorHelloService extends HelloService {

}
