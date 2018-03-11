package com.itheima.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
	/*
	 * 生命周期执行流程示例
	 * 实例化   初始化     销毁
	 * 
	 * */
	public static void main(String[] args) {
		// 1. 定义配置文件路径
		String xmlPath = "com/itheima/life/life.xml";
		// 2. ClassPathXmlApplicationContext在加载配置文件时，对Bean进行实例化
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		context.close();
	}
}
