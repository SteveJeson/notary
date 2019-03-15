package com.bm.notaryconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description 
 * @author liuwei
 * @return 
 * @exception 
 * @date 2019/3/15 11:46
 */
@RestController
public class ConsumerController {

  @Autowired
  RestTemplate restTemplate;

  @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
  public String helloConsumer() {
    return restTemplate.getForEntity("http://notary-service/hello", String.class).getBody();
  }
}
