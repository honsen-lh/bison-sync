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

@Configuration
@MapperScan(basePackages ={"com.leaderment.sqlserver_mapper"} , sqlSessionFactoryRef = "sqlSessionFactory2")
public class Db2Config {
	@Autowired
	@Qualifier("secondDataSource")
	private DataSource ds2;
	
	@Bean
	public SqlSessionFactory sqlSessionFactory2() throws Exception{
		SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
		ssf.setDataSource(ds2);
		return ssf.getObject();
	}
	@Bean
	public SqlSessionTemplate sqlSessionTemplate2() throws Exception{
		SqlSessionTemplate sst = new SqlSessionTemplate(sqlSessionFactory2());
		return sst;
		
	}
}
