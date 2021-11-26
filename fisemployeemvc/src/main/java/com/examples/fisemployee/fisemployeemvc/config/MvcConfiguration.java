package com.examples.fisemployee.fisemployeemvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.examples.fisemployee.fisemployeemvc.dao.FisemployeeDaoImpl;
import com.examples.fisemployee.fisemployeemvc.service.FisemployeeServiceImpl;


@Configuration
@ComponentScan(basePackages="com.examples.fisemployee.fisemployeemvc")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DriverManagerDataSource createDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/fisglobal");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(createDataSource());
		return template;
	}
	
	@Bean
	public FisemployeeDaoImpl getFisemployeeDao() {
		FisemployeeDaoImpl dao = new FisemployeeDaoImpl();
		dao.setTemplate(getTemplate());
		return dao;
	}
	
	@Bean
	public FisemployeeServiceImpl getFisemployeeService() {
		FisemployeeServiceImpl service = new FisemployeeServiceImpl();
		service.setRepo(getFisemployeeDao());
		return service;
	}
	
}
