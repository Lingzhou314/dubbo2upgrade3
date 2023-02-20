package com.demo2.service;

import org.apache.dubbo.config.annotation.DubboService;

import com.demo.dubbo2.Dubbo2Provider;

@DubboService
public class Dubbo2ProviderImpl implements Dubbo2Provider{

	@Override
	public String sayHello(String name) {
		System.out.println("sayHello " + name);
		return "dubbo2 sayHello "+ name;
	}

}
