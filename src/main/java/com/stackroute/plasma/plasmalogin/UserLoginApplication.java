package com.stackroute.plasma.plasmalogin;

import com.stackroute.plasma.plasmalogin.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserLoginApplication {
    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.addUrlPatterns("/api/v1/*");
        return registrationBean;
    }


    public static void main(String[] args) {
		SpringApplication.run(UserLoginApplication.class, args);
	}


}

