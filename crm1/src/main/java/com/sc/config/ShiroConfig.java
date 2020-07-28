package com.sc.config;

import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.entity.XtPowerDetail;
import com.sc.realm.CustomRealmMD5;
import com.sc.service.XtPowerService;

@Configuration
public class ShiroConfig {
   
	
	@Autowired
	XtPowerService xtPowerService;
	
	
	@Bean
	public CustomRealmMD5 customRealmMD5(){
		CustomRealmMD5 realm=new CustomRealmMD5();
		HashedCredentialsMatcher matcher=new HashedCredentialsMatcher();
		matcher.setHashAlgorithmName("md5");
		matcher.setHashIterations(3);
		realm.setCredentialsMatcher(matcher);
		return realm;
	}
	//配置安全管理器
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
		//注入上面配置的realm
		manager.setRealm(this.customRealmMD5());
		return manager;
	}
	
	//配置过滤器工厂
	@Bean("shiroFilter")
	public ShiroFilterFactoryBean shiroFilter() {
		//表单认证过滤器
		FormAuthenticationFilter form=new FormAuthenticationFilter();
		form.setLoginUrl("/loginctrl/login.do");
		form.setUsernameParam("userName");
		form.setPasswordParam("userPass");
		
		//配置过滤器工厂
		ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
		//注入安全管理器
		shiroFilter.setSecurityManager(this.securityManager());
		//登录的url
		shiroFilter.setLoginUrl("/login.jsp");
		//认证成功的url地址
		shiroFilter.setSuccessUrl("/loginctrl/main.do");
		//未认证URL（无权限）
		shiroFilter.setUnauthorizedUrl("/nopermission.jsp");
		
		//退出登录过滤器 
		LogoutFilter logout=new LogoutFilter();
		//退出的url
		logout.setRedirectUrl("/login.jsp");
		
		//里面放所有过滤器
		LinkedHashMap<String, Filter> filters=new LinkedHashMap<String, Filter>();
		//用这个过滤器做认证
	    filters.put("authc", form);
	    //用这个过滤器做退出
	    filters.put("logout", logout);
	    
	    
	    //把filters过滤器放到shiroFilter过滤器工厂
	    shiroFilter.setFilters(filters);
	    
	    LinkedHashMap<String, String> Map=new LinkedHashMap<String, String>();
		
		Map.put("/images/**", "anon");
		Map.put("/css/**", "anon");
		Map.put("/js/**", "anon");
		Map.put("/upload/**", "anon");
		Map.put("/html/**", "anon");
		Map.put("/lib/**", "anon");
		Map.put("/static/**", "anon");
		Map.put("/temp/**", "anon");
		
		Map.put("/login.jsp", "anon");
		
		Map.put("/logout.do", "logout");
		
		
		//配置哪些路径需要哪些权限（通过权限别名来识别）
		List<XtPowerDetail> list = xtPowerService.selectpowerall();
		if (list!=null&&list.size()>0) {
			System.out.println("****************所有权限：");
			for (XtPowerDetail perm:list) {
				String url=perm.getPower();
				String permss=perm.getRemark();
				if (url!=null&&!url.equals("")&&permss!=null&&!permss.equals("")) {
					System.out.println("-------------url:"+url);
					Map.put(url, "perms[" + permss + "]"); //Map.put("/xtpowerctrl/addxtpower.do", "perms[xtpower:add]");
					
				}
			}
		}
		
		
		
		Map.put("/**", "authc");
		
		//把map也放到过滤器工厂shiroFilter里面
		shiroFilter.setFilterChainDefinitionMap(Map);
		return shiroFilter;
	}
	
}