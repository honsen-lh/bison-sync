package com.leaderment.jdk_proxy;

public class App {
	public static void main(String[] args) {
		//目标对象
		IUserDao target = new UserDao();
		System.out.println(target.getClass());
		
		
		// 给目标对象，创建代理对象
		ProxyFactory proxyFactory = new ProxyFactory(target);
		IUserDao proxy = (IUserDao)proxyFactory.getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
	}
}
