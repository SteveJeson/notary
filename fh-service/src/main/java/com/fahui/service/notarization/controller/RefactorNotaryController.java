package com.fahui.service.notarization.controller;

import com.fahui.api.notarization.entity.User;
import com.fahui.api.notarization.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * @author liuwei
 * @return
 * @exception
 * @date 2019/3/15 17:31
 */
@RestController
public class RefactorNotaryController implements HelloService {

  @Override
  public String hello(@RequestParam("name") String name) {
    return "Hello" + name;
  }

  @Override
  public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
    return new User(name, age);
  }

  @Override
  public String hello(@RequestBody User user) {
    return "Hello " + user.getName() + ", " + user.getAge();
  }
}
