package com.bm.notaryconsumer.controller;

import com.bm.notaryconsumer.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 
 * @author liuwei
 * @return
 * @exception 
 * @date 2019/3/15 14:59
 */
@RestController
public class ConsumerController {

  @Autowired
  HelloService helloService;

  @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
  public String helloConsumer() {
    return helloService.helloService();
  }
}
