package com.itheima.instance.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 构造器实例化
 * */
public class InstanceTest1 {
      public static void main(String[] args) {
		//1. 定义配置文件路径
    	 String xmlPath="com/itheima/instance/contructor/beans1.xml";
    	//2. ApplicationContext在加载配置文件时，对Bean进行实例化
    	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    	
    	/*Bean1 bean = (Bean1) applicationContext.getBean("bean1");
    	 System.out.println(bean);*/
    	 System.out.println(applicationContext.getBean("bean1"));
	}
}