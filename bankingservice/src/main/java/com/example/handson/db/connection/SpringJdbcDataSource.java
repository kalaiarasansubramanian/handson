package com.example.handson.db.connection;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example.handson.db.connection")
public class SpringJdbcDataSource {
	private static Logger LOGGER = Logger.getLogger(SpringJdbcDataSource.class);
	
	@Bean
	@Primary
	public DataSource getDataSource() {
		LOGGER.debug("Creating a datasource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
		dataSource.setUrl("jdbc:hsqldb:hsql://localhost/mydb");
		dataSource.setUsername("sa");
		dataSource.setPassword("");

		return dataSource;
	}
}
