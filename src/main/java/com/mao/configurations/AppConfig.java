package com.mao.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mao.converter.RoleToUserProfileConverter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")


public class AppConfig extends WebMvcConfigurerAdapter{

	RoleToUserProfileConverter roleToUserProfileConverter;
	
}
