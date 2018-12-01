/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.dal.manager.impl
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.dal.manager.impl;

import com.mhc.challenger.dal.domain.AssetOneAssetStorage;
import com.mhc.challenger.dal.dao.AssetOneAssetStorageDao;
import com.mhc.challenger.dal.manager.AssetOneAssetStorageManager;
import com.mhc.framework.common.base.dal.BaseManagerImpl;
import org.springframework.stereotype.Component;

/**   
 * <p> 资产入库记录表，用于资产采购时的资产登记
 Manager实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@Component
public class AssetOneAssetStorageManagerImpl extends BaseManagerImpl<AssetOneAssetStorageDao, AssetOneAssetStorage> implements AssetOneAssetStorageManager {

}
