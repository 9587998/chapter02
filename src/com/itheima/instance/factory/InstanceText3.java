package com.itheima.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceText3 {

	public static void main(String[] args) {
		//1. 定义配置文件路径
   	 String xmlPath="com/itheima/instance/factory/beans3.xml";
   	//2. ApplicationContext在加载配置文件时，对Bean进行实例化
   	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
   	 System.out.println(applicationContext.getBean("bean3"));
   	
	}
}
