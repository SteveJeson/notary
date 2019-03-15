package com.bm.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description 
 * @author liuwei
 * @return
 * @exception 
 * @date 2019/3/15 17:01
 */
@FeignClient("notary-service")
public interface HelloService {

  @RequestMapping("/hello")
  String hello();

}
