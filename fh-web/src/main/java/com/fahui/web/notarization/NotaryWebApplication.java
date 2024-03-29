package com.fahui.web.notarization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * description
 * @author liuwei
 * @return
 * @exception
 * @date 2019/3/15 16:29
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NotaryWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotaryWebApplication.class, args);
  }

}
