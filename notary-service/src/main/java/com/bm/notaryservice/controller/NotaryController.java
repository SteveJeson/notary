package com.bm.notaryservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 
 * @author liuwei
 * @return 
 * @exception 
 * @date 2019/3/14 15:23
 */
@RestController
public class NotaryController {

  private static final Logger logger = LoggerFactory.getLogger(NotaryController.class);

  @RequestMapping("/hello")
  public String index() {
    logger.info("welcome to home!");
    return "Hello World!";
  }
}
