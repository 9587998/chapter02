package com.itheima.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Bean����������ʾ
 * */
public class ScopeTest {
	public static void main(String[] args) {
		// 1. ���������ļ�·��
		String xmlPath = "com/itheima/scope/beans4.xml";
		// 2. ApplicationContext�ڼ��������ļ�ʱ����Bean����ʵ����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// �����õ�ʵ��
		// singleton����
		System.out.println(applicationContext.getBean("scope"));
		System.out.println(applicationContext.getBean("scope"));
		// prototype����
		System.out.println(applicationContext.getBean("scope1"));
		System.out.println(applicationContext.getBean("scope1"));
	}
}