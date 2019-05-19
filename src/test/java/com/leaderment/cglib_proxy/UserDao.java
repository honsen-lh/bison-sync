package com.leaderment.cglib_proxy;
/*
 * 目标对象，没有实现接口
 */
public class UserDao {
	public void save(){
		System.out.println("--保存数据--");
	}
}
