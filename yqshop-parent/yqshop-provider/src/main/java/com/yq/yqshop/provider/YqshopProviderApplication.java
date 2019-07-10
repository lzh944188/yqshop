package com.yq.yqshop.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //该微服务将参照application.yml中的配置注册到Eureka
public class YqshopProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YqshopProviderApplication.class, args);
	}

}
