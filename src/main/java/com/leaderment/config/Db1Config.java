package com.leaderment.config;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages ={"com.leaderment.mysql_mapper"}, sqlSessionFactoryRef = "sqlSessionFactory1")
public class Db1Config {
	@Autowired
	@Qualifier("primaryDataSource")
	private DataSource ds1;
	
	@Bean
	public SqlSessionFactory sqlSessionFactory1() throws Exception{
		SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
		ssf.setDataSource(ds1);
		return ssf.getObject();
	}
	@Bean
	public SqlSessionTemplate sqlSessionTemplate1() throws Exception{
		SqlSessionTemplate sst = new SqlSessionTemplate(sqlSessionFactory1());
		return sst;
	}
	//配置事务
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager1(){
		DataSourceTransactionManager dtm = new DataSourceTransactionManager(ds1);
		return dtm;
	}
}
