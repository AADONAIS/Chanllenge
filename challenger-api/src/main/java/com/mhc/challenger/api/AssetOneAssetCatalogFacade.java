/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.api
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.api;

import com.mhc.bs.common.base.APIResult;

/**   
 * <p> 资产目录表 服务接口 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
public interface AssetOneAssetCatalogFacade {
	/**
	 * <p> 测试Hello World </p>
	 *  
	 * @param world 输入字符串
	 * @return APIResult<String>
	 */
	APIResult<String> hello(String world);
}
