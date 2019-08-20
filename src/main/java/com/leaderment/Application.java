package com.leaderment;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Springboot 启动类
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.leaderment.mysql_mapper","com.leaderment.sqlserver_mapper","com.leaderment.quartz.mapper"})
@MapperScan({"com.leaderment.mysql_mapper","com.leaderment.sqlserver_mapper"})  
@EnableScheduling
public class Application 
{
    public static void main( String[] args ){
    	SpringApplication.run(Application.class, args);
    }
}
