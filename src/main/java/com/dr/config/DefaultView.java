package com.dr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.dr.interceptor.SessionInterceptor;

@Configuration
public class DefaultView implements WebMvcConfigurer{
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		// 将静态资源排除在拦截之外
		//registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/static/**");
	}

	 @Override
     public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("StoreManage/index");
		registry.addViewController("/").setViewName("main");
	}
}
