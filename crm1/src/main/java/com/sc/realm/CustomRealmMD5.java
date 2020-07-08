package com.sc.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.XtUserAccount;
import com.sc.service.XtUserAccountService;

public class CustomRealmMD5 extends AuthorizingRealm {

	@Autowired
	XtUserAccountService xtUserAccountService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		XtUserAccount userAccount = (XtUserAccount)arg0.getPrimaryPrincipal();
		System.out.println("当前需要被认证的用户是："+userAccount.getUserName());
		//1、从数据库查询该用户权限
		List<String> list=new ArrayList<String>();
		/*List<SysPermission> perms = sysPermissionService.getPermissionByUsercode(sysUser.getUsercode());
		if (perms!=null&&perms.size()>0) {
			System.out.println("该用户拥有权限：");
			for (SysPermission perm:perms) {
				String code=perm.getPercode();
				if (code!=null&&!code.equals("")) {
					System.out.println("------------------"+code);
					list.add(code);
					
				}
			}
		}*/
		
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		info.addStringPermissions(list);
		
		return info;
	}

	//用户认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String)token.getPrincipal();
		System.out.println("当前需要被认证的用户是："+username);
		
		//1、模拟合法用户信息，判断认证
		XtUserAccount userAccount=xtUserAccountService.login(username);
		if (userAccount==null) {
			System.out.println("用户不存在");
			return null;//不存在此用户
		}
		//2、模拟该用户密码（与数据库密码对比）
		String password=userAccount.getUserPass();
		String salt="qwerty";//盐
		
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(userAccount,password,ByteSource.Util.bytes(salt),super.getName());
		return info;
	}


}
