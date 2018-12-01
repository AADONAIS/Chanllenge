/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.core.biz
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.core.biz;

import com.mhc.challenger.api.AssetOneAssetReceiveRecordFacade;
import com.mhc.bs.common.base.APIResult;
import org.springframework.stereotype.Service;

/**   
 * <p> 领用记录表 服务实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
@Service
public class AssetOneAssetReceiveRecordFacadeImpl implements AssetOneAssetReceiveRecordFacade {

	@Override
	public APIResult<String> hello(String world) {
		return APIResult.ok("Hello "+ world);
	}
}
