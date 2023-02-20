package com.demo3.service;

import org.apache.dubbo.config.annotation.DubboService;

import com.demo.dubbo3.Dubbo3Provider;

@DubboService
public class Dubbo3ProviderImpl implements Dubbo3Provider {

	@Override
	public String sayHello(String name) {
		System.out.println("sayHello " + name);
		return "dubbo3 sayHello "+ name;
	}

}
