package com.itheima.instance.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * ������ʵ����
 * */
public class InstanceTest1 {
      public static void main(String[] args) {
		//1. ���������ļ�·��
    	 String xmlPath="com/itheima/instance/contructor/beans1.xml";
    	//2. ApplicationContext�ڼ��������ļ�ʱ����Bean����ʵ����
    	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    	
    	/*Bean1 bean = (Bean1) applicationContext.getBean("bean1");
    	 System.out.println(bean);*/
    	 System.out.println(applicationContext.getBean("bean1"));
	}
}