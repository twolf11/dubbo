/**
 * 
 */
package com.lcy.common.filter.svc;

/**
 * @author lcy
 * @date 2018年3月19日上午11:52:31
 *
 */
public interface IFilterChainDefinitionsService {
	
	/**
	 * 从DB加载、更新菜单权限
	 * @author lcy
	 * @date 2018年3月19日上午11:52:47
	 */
	public void reloadFilterChains();
	
	
}
