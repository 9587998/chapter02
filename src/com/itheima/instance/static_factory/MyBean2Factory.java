package com.itheima.instance.static_factory;

public class MyBean2Factory {
    public MyBean2Factory() {
		// TODO Auto-generated constructor stub
    	 System.out.println("Bean2工厂实例化中...");
	}
	public static Bean2 creatBean() {
		return new Bean2();
	}
}
