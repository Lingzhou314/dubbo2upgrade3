package com.demo2;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dubbo3.Dubbo3Provider;

@EnableDubbo
@SpringBootApplication
public class Dubbo2Application {

	@DubboReference
	Dubbo3Provider dubbo3Provider;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Dubbo2Application.class, args);
	}

	@RestController
	class IndexController {
		
		@GetMapping("/")
		public String index() {
			return dubbo3Provider.sayHello("dubbo2");
		}
	}

}
