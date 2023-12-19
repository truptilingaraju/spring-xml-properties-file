package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("my_conf.xml");
		Mobile mobile=(Mobile)context.getBean("myMobile");
		System.out.println(mobile);
	}
}
