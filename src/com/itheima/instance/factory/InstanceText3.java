package com.itheima.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceText3 {

	public static void main(String[] args) {
		//1. ���������ļ�·��
   	 String xmlPath="com/itheima/instance/factory/beans3.xml";
   	//2. ApplicationContext�ڼ��������ļ�ʱ����Bean����ʵ����
   	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
   	 System.out.println(applicationContext.getBean("bean3"));
   	
	}
}
