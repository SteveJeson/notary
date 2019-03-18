package com.fahui.service.notarization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NotaryServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotaryServiceApplication.class, args);
  }

}
