package com.itheima.instance.static_factory;

public class MyBean2Factory {
    public MyBean2Factory() {
		// TODO Auto-generated constructor stub
    	 System.out.println("Bean2����ʵ������...");
	}
	public static Bean2 creatBean() {
		return new Bean2();
	}
}
