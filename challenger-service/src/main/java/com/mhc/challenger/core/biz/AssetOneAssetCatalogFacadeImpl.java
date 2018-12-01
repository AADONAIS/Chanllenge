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

import com.mhc.bs.common.base.APIResult;
import com.mhc.challenger.api.AssetOneAssetCatalogFacade;
import com.mhc.challenger.core.biz.service.AssetOneAssetCatalogService;
import com.mhc.challenger.dal.domain.AssetOneAssetCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mhc.bs.common.base.APIResult.ok;

/**  
 * <p> 资产目录表 服务实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
@Service
public class AssetOneAssetCatalogFacadeImpl implements AssetOneAssetCatalogFacade {

	@Autowired
	AssetOneAssetCatalogService assetOneAssetCatalogService;


	public APIResult selectListAssetCatalog(){
		return ok(assetOneAssetCatalogService.selectListAssetCatalog());
	}

	public APIResult selectByIdcatalog(int id){
	    return ok(assetOneAssetCatalogService.selectByIdcatalog(id));
    }
	@Override
	public APIResult<String> hello(String world) {
		return ok("Hello "+ world);
	}
}
