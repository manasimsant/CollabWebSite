package org.dteja.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.dteja.models.Blog;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.dteja")
@EnableTransactionManagement
public class DBConfig 
{
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@myserver:1521/CollabDB");
		dataSource.setUsername("CollabDB");
		dataSource.setPassword("pass123");
		System.out.println("--Created the DataSource -----");
		return dataSource;
	}
	
	@Autowired
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		Properties hibernateProp=new Properties();
		hibernateProp.put("hibernate.hbmddl2.auto", "update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		
		LocalSessionFactoryBuilder factoryBuilder=new LocalSessionFactoryBuilder(getDataSource());
		factoryBuilder.addProperties(hibernateProp);
		
		factoryBuilder.addAnnotatedClass(Blog.class);
		
		SessionFactory sessionFactory=factoryBuilder.buildSessionFactory();
		System.out.println("--Created the sessionFactory -----");
		return sessionFactory;	}
	
	@Autowired
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		
		return new HibernateTransactionManager(sessionFactory);
	}
}