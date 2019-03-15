package com.bm.feignconsumer.controller;

import com.bm.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 
 * @author liuwei
 * @return
 * @exception 
 * @date 2019/3/15 17:07
 */
@RestController
public class ConsumerController {

  @Autowired
  HelloService helloService;

  @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
  public String helloConsumer() {
    return helloService.hello();
  }
}
