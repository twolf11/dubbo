/**
 * 
 */
package com.lcy.common.filter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcy.dubbo.service.BasicService;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;


/**
 * @author lcy
 * @date 2018年3月14日上午11:25:27
 *
 */
public class CustomRolesAuthorizationFilter extends AuthorizationFilter {

    @Reference(version = "1.0.0")
    private BasicService basicService;
//    @Resource
//    private RedisClusterCache redisClusterCache;

    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        Subject subject = getSubject(request, response);
        PrincipalCollection principals = subject.getPrincipals();
        if (null == principals) {
            return true;
        }

        String username = principals.toString();

//        Object cache = redisClusterCache.getCache(sessionId.toString() + "==" + localAddr + "==" + userName);

        String[] rolesArray = (String[]) mappedValue;
        if (rolesArray == null || rolesArray.length == 0) {
            return true;
        }

        List<String> rolesList = Arrays.asList(rolesArray);

        User user = userSvc.selectByUsername(username);
        //当前用户具有的权限
        Set<String> roles = new HashSet<String>();
		roles.add(user.getRole());

//        redisClusterCache.putCacheWithExpireTime(sessionId.toString() + "==" + localAddr + "==" + userName, roles, 86400); //24小时过期

        boolean disjoint = Collections.disjoint(roles, rolesList);
        if (!disjoint) {
            return true;
        }

        /*for (String aRolesArray : rolesArray) {
            if (subject.hasRole(aRolesArray)) {
                return true;
            }
        }*/
        return false;
    }
}