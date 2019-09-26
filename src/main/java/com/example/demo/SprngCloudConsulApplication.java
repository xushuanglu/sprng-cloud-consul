package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class SprngCloudConsulApplication {
	
	 @Autowired
	    private DiscoveryClient discoveryClient;

	    /**
	     * 获取所有服务
	     */
	    @RequestMapping("/services")
	    public Object services() {
	        return discoveryClient.getServices();
	    }

	    @RequestMapping("/home")
	    public String home() {
	        return "Hello World";
	    }

	public static void main(String[] args) {
		SpringApplication.run(SprngCloudConsulApplication.class, args);
	}

}
