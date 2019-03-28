/**
 * 
 */
package com.lcy.common.realm;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.yyfwj.basic.modle.User;
import com.yyfwj.basic.svc.SysUserSvc;

/**
 * @author lcy
 * @date 2018年3月12日上午10:02:08
 *
 */
public class LoginRealm extends AuthorizingRealm {

	@Resource
	private SysUserSvc userSvc;
	

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationtoken) throws AuthenticationException {
		
		SimpleAuthenticationInfo info = null;
		UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationtoken;
		String username = upToken.getUsername();
		User user = userSvc.selectByUsername(username);
		if(user!=null) {
			Object principal = user;
			Object credentials = user.getPassword();
			String realmName = this.getName();
			ByteSource salt = ByteSource.Util.bytes(username);
			SimpleHash sHash = new SimpleHash("MD5", credentials, salt, 1024);
			info = new SimpleAuthenticationInfo(principal, sHash, salt, realmName);
		}else {
			throw new AuthenticationException();
		}
		
		return info;
	}


	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		SimpleAuthorizationInfo info = null;
		User user = (User) principalCollection.getPrimaryPrincipal();
		if (user!=null) {
			Set<String> roles = new HashSet<String>();
			roles.add(user.getRole());
			info = new SimpleAuthorizationInfo(roles);
		} else {
			throw new AuthenticationException();
		}
		return info;
	}


}
