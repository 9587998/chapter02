package com.itheima.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
	/*
	 * ��������ִ������ʾ��
	 * ʵ����   ��ʼ��     ����
	 * 
	 * */
	public static void main(String[] args) {
		// 1. ���������ļ�·��
		String xmlPath = "com/itheima/life/life.xml";
		// 2. ClassPathXmlApplicationContext�ڼ��������ļ�ʱ����Bean����ʵ����
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		context.close();
	}
}
