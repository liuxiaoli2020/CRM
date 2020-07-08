package com.sc.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.realm.CustomRealmMD5;

@Configuration
public class ShiroConfig {
    
	
	@Bean
	public CustomRealmMD5 customRealmMD5(){
		CustomRealmMD5 realm=new CustomRealmMD5();
		HashedCredentialsMatcher matcher=new HashedCredentialsMatcher();
		matcher.setHashAlgorithmName("md5");
		matcher.setHashIterations(3);
		realm.setCredentialsMatcher(matcher);
		return realm;
	}
	
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
		manager.setRealm(this.customRealmMD5());
		return manager;
	}
	
	@Bean("shiroFilter")
	public ShiroFilterFactoryBean shiroFilter() {
		FormAuthenticationFilter form=new FormAuthenticationFilter();
		form.setLoginUrl("/loginctrl/login.do");
		form.setUsernameParam("userName");
		form.setPasswordParam("userPass");
		
		ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(this.securityManager());
		shiroFilter.setSuccessUrl("/loginctrl/main.do");
		shiroFilter.setLoginUrl("/login.jsp");
		shiroFilter.setUnauthorizedUrl("/nopermission.jsp");
		
		LogoutFilter logout=new LogoutFilter();
		logout.setRedirectUrl("/login.jsp");
		
		Map<String, Filter> filters=new HashMap<String, Filter>();
	    filters.put("authc", form);
	    filters.put("logout", logout);
	    shiroFilter.setFilters(filters);
	    
	    Map<String, String> Map=new HashMap<String, String>();
		
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
		
		
		/*Map.put("/goodsctrl/goadd.do", "perms[goods:add]");
		Map.put("/goodsctrl/goupdate.do", "perms[goods:update]");
		Map.put("/goodsctrl/delete.do", "perms[goods:delete]");
		Map.put("/goodsctrl/selectpage.do", "perms[goods:select]");
		*/
		/*List<SysPermission> list = sysPermissionService.getAllPermissions();
		if (list!=null&&list.size()>0) {
			System.out.println("所有权限：");
			for (SysPermission perm:list) {
				String url=perm.getUrl();
				String code=perm.getPercode();
				if (code!=null&&!code.equals("")&&url!=null&&!url.equals("")) {
					System.out.println("-------------url:"+url+"-------------code:"+code);
					Map.put(url, "perms["+code+"]");
					
				}
			}
		}*/
		
		
		
		Map.put("/**", "authc");
		
		shiroFilter.setFilterChainDefinitionMap(Map);
		return shiroFilter;
	}
	
}
