package com.fahui.web.notarization.service;

import com.fahui.api.notarization.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "notary-service")
public interface RefactorHelloService extends HelloService {

}
