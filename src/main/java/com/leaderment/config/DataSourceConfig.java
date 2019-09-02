package com.leaderment.config;


import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
	@Bean(name="primaryDataSource")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.db1")
	public DataSource DataSource1(){
		return DataSourceBuilder.create().build();
	}
	@Bean(name="secondDataSource")
	@ConfigurationProperties(prefix="spring.datasource.db2")
	public DataSource DataSource2(){
		return DataSourceBuilder.create().build();
	}
}
