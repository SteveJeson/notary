package com.bm.notaryconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * description
 * @author liuwei
 * @return
 * @exception
 * @date 2019/3/15 14:59
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class NotaryConsumerApplication {

  @Bean
  @LoadBalanced
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(NotaryConsumerApplication.class, args);
  }

}
