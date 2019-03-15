package com.bm.notaryconsumer.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * description 
 * @author liuwei
 * @return 
 * @exception 
 * @date 2019/3/15 15:18
 */
@Service
public class HelloService {

  @Autowired
  RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "helloFallBack")
  public String helloService() {
    return restTemplate.getForEntity("http://notary-service/hello", String.class).getBody();
  }

  public String helloFallBack() {
    return "error";
  }
}
