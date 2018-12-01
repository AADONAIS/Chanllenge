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

import com.mhc.challenger.api.AssetOneAssetTypeFacade;
import com.mhc.bs.common.base.APIResult;
import com.mhc.challenger.core.biz.service.AssetOneAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.mhc.bs.common.base.APIResult.ok;

/**   
 * <p> 资产类型表 服务实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
@Service
public class AssetOneAssetTypeFacadeImpl implements AssetOneAssetTypeFacade {

	@Autowired
	AssetOneAssetService assetOneAssetService;
	@Override
	public APIResult<String> hello(String world) {
		return ok("Hello "+ world);
	}

	public APIResult selectListType(){
		return ok(assetOneAssetService.selectListAssets());
	}
}
