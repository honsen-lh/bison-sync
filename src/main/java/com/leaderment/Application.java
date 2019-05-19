package com.leaderment;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot 启动类
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.leaderment.mysql_mapper","com.leaderment.sqlserver_mapper","com.leaderment.quartz.mapper"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan({"com.leaderment.mysql_mapper","com.leaderment.sqlserver_mapper"})  
//@MapperScan({"com.leaderment.*"})  
public class Application 
{
    public static void main( String[] args ){
    	SpringApplication.run(Application.class, args);
    }
}
