package com.itheima.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Bean的作用域演示
 * */
public class ScopeTest {
	public static void main(String[] args) {
		// 1. 定义配置文件路径
		String xmlPath = "com/itheima/scope/beans4.xml";
		// 2. ApplicationContext在加载配置文件时，对Bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// 输出获得的实例
		// singleton类型
		System.out.println(applicationContext.getBean("scope"));
		System.out.println(applicationContext.getBean("scope"));
		// prototype类型
		System.out.println(applicationContext.getBean("scope1"));
		System.out.println(applicationContext.getBean("scope1"));
	}
}