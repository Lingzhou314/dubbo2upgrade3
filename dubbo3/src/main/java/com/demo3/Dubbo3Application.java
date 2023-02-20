package com.demo3;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dubbo2.Dubbo2Provider;

@EnableDubbo
@SpringBootApplication
public class Dubbo3Application{

	@DubboReference
	Dubbo2Provider dubbo2Provider;
	
	public static void main(String[] args) {
		SpringApplication.run(Dubbo3Application.class, args);
	}

	@RestController
	class IndexController {
		
		@GetMapping("/")
		public String index() {
			return dubbo2Provider.sayHello("dubbo3");
		}
	}
}
