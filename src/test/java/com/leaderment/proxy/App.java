package com.leaderment.proxy;

public class App {
	public static void main(String[] args) {
		// 目标对象
		UserDao target = new UserDao();
		UserDaoProxy userDaoProxy = new UserDaoProxy(target);
		userDaoProxy.save();
	}
}


