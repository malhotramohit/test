package com.example.demo12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class JPAConfig {

	@Bean
	public AuditorAware<String>  auditAware(){
		return new AuditorAwareImpl();
	}
}
