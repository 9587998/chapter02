package com.itheima.instance.factory;

public class MyBean3Factory {
	
	public MyBean3Factory() {
		// TODO Auto-generated constructor stub
		System.out.println("Bean3����ʵ������...");
	}
	
	public  Bean3 creatBean() {
		return new Bean3();
	}

}
