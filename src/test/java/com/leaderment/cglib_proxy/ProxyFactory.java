package com.leaderment.cglib_proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;


/*
 * cglib 子类代理工厂
 * 对userDao在内存中动态创建一个子类对象
 */
public class ProxyFactory implements MethodInterceptor{
	//维护目标对象
	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;
	}
	//给目标对象创建一个代理对象
	public Object getProxyInstance(){
		//工具类
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		//System.out.println("enhancer:"+enhancer.create());
		return enhancer.create();
	}
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, org.springframework.cglib.proxy.MethodProxy arg3)
			throws Throwable {
		System.out.println("开始事务...");

        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);

        System.out.println("提交事务...");

        return returnValue;
	}
}
