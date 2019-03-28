package com.lcy.common.filter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.util.CollectionUtils;

import com.yyfwj.basic.modle.SysMenu;
import com.yyfwj.util.JdbcUtil;

/**
 * @author lcy
 * @date 2018年3月14日下午5:22:42
 *
 */
public class ShiroPermissionFactory extends ShiroFilterFactoryBean {

	/** 记录配置中的过滤链 */
	public static String definition = "";

	/**
	 * 初始化设置过滤链
	 */
	@Override
	public void setFilterChainDefinitions(String definitions) {
		// String token = manageUserService.getAdminToken(0);
		// 可从数据库读取后，添加至过滤链，参考此处已注释的代码
		definition = definitions;// 记录配置的静态过滤链
		// List<Permission> permissions = permissService.findAll();
		Map<String, String> otherChains = new HashMap<String, String>();
		String sql = "select * from stat_menu";
		try (Connection conn = JdbcUtil.connect();
				PreparedStatement statement = conn.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery();) {
			while (resultSet.next()) {
				SysMenu sysMenu = new SysMenu();
				sysMenu.setLink(resultSet.getString("link"));
				sysMenu.setRole(resultSet.getString("role"));
				String str[] = sysMenu.getRole().split(",");
				if (str.length > 1)
					otherChains.put(sysMenu.getLink(), "authc,roles[\"" + sysMenu.getRole() + "\"]");
				else
					otherChains.put(sysMenu.getLink(), "authc,roles[" + sysMenu.getRole() + "]");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		// 加载配置默认的过滤链
		Ini ini = new Ini();
		ini.load(definitions);
		Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
		if (CollectionUtils.isEmpty(section)) {
			section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
		}
		
//		// 加上数据库中过滤链
		section.putAll(otherChains);
		section.remove("/**");
		section.put("/**", "authc");
		setFilterChainDefinitionMap(section);

	}
}
