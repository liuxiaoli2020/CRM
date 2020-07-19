/*package com.sc.controller;

import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.entity.XtLog;
import com.sc.entity.XtUserAccount;
import com.sc.service.XtLogService;

@Component
@Aspect
public class LogAop {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private XtLogService xtLogService;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date accessDate;// 访问时间
	private Class executionClass;// 访问的类
	private Method executionMethod; // 访问的方法
	
	// 主要获取访问时间、访问的类、访问的方法
	@Before("execution(* com.sc.controller.*.*(..))")
	public void doBefore(JoinPoint jp) throws NoSuchMethodException, SecurityException {
		  
		accessDate = new Date(); // 访问时间
		// 获取访问的类
		executionClass = jp.getTarget().getClass();
		// 获取访问的方法
		String methodName = jp.getSignature().getName();// 获取访问的方法的名称
		Object[] args = jp.getArgs();// 获取访问的方法的参数
		if (args == null || args.length == 0) {// 无参数
		executionMethod = executionClass.getMethod(methodName); // 只能获取无参数方法
		} else {
		// 有参数，就将args中所有元素遍历，获取对应的Class,装入到一个Class[]
		Class[] classArgs = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			classArgs[i] = args[i].getClass();
			}
			executionMethod = executionClass.getMethod(methodName, classArgs);// 获取有参数方法
			}
			}

	// 主要获取日志中其它信息，时长、ip、url...
	@After("execution(* com.sc.controller.*.*(..))")
	public void doAfter(JoinPoint jp) throws Exception {
	      Date time =new Date(new Date().getTime() - accessDate.getTime()); //获取访问的时长
	      String url = "";
	        //获取url
	        if (executionClass != null && executionMethod != null && executionClass != LogAop.class) {
	            //1.获取类上的@RequestMapping("/orders")
	            RequestMapping classAnnotation = (RequestMapping) executionClass.getAnnotation(RequestMapping.class);
	            if (classAnnotation != null) {
	                String[] classValue = classAnnotation.value();
	                //2.获取方法上的@RequestMapping(xxx)
	                RequestMapping methodAnnotation = executionMethod.getAnnotation(RequestMapping.class);
	                if (methodAnnotation != null) {
	                    String[] methodValue = methodAnnotation.value();
	                    url = classValue[0] + methodValue[0];

	                    //获取访问的ip
	                    String ip = request.getRemoteAddr();

	                    //获取当前操作的用户
	                    SecurityContext context = SecurityContextHolder.getContext();//从上下文中获了当前登录的用户
	                    User  user = (User) context.getAuthentication().getPrincipal();
	                    String username = user.getUsername();
	                    
	                    
	                    //将日志相关信息封装到XtLog对象
	                    XtLog xtLog = new XtLog();
	                    xtLog.setAccessDate(time); //执行时长
	                    xtLog.setAccessIp(ip);
	                    xtLog.setPower("[类名] " + executionClass.getName() + "[方法名] " + executionMethod.getName());
	                    
	                    xtLog.setUserId(userid);
	                    xtLog.setAccessDate(accessDate);
	                    xtLog.setCompanyId(companyId);

	                    //调用Service完成操作
	                    xtLogService.adddall(xtLog);
	                }
	            }
	        }
	}
	
}
*/