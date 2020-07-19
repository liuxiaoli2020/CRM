package com.sc.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//使用java代码配置拦截启
//获取到除登陆请求外的所有请求的请求信息，存到数据库
@Configuration
public class SessionConfiguration implements WebMvcConfigurer {

	@Autowired
	LoginInterceptor loginInterceptor;
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		//这个路径的都要经过拦截器
        InterceptorRegistration addPathPatterns = registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
        //这个路径不用拦截
        addPathPatterns.excludePathPatterns("/loginctrl/main.do");
        addPathPatterns.excludePathPatterns("/loginctrl/login.do");
    }
}
