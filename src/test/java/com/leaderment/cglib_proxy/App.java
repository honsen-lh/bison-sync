package com.leaderment.cglib_proxy;

import org.junit.Test;

public class App {
	@Test
	public void test(){
		//目标对象
		UserDao target = new UserDao();
		//代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		//System.out.println("proxy:"+proxy);
		//执行代理对象的方法
		proxy.save();
	}
}
