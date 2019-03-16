package com.bm.feignconsumer.controller;

import com.bm.feignconsumer.service.RefactorHelloService;
import com.bm.notaryserviceapi.model.User;
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
  RefactorHelloService refactorHelloService;

  @RequestMapping(value = "feign-consumer2", method = RequestMethod.GET)
  public String helloConsumer2() {
    StringBuilder builder = new StringBuilder();
    builder.append(refactorHelloService.hello("liuwei")).append("\n");
    builder.append(refactorHelloService.hello("liuwei", 20)).append("\n");
    builder.append(refactorHelloService.hello(new User("liuwei", 20))).append("\n");
    return builder.toString();
  }
}
