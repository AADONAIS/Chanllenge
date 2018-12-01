/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.core.biz.service.impl
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.core.biz.service.impl;

import com.mhc.challenger.core.biz.service.AssetOneAssetTypeService;
import com.mhc.challenger.dal.domain.AssetOneAssetType;
import com.mhc.challenger.dal.manager.AssetOneAssetTypeManager;
import com.mhc.framework.common.base.biz.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**   
 * <p> 资产类型表 服务实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
@Service
public class AssetOneAssetTypeServiceImpl extends BaseServiceImpl implements AssetOneAssetTypeService {

    @Autowired
    AssetOneAssetTypeManager assetOneAssetTypeManager;

    @Override
    public List<AssetOneAssetType> selectListType(){
        return assetOneAssetTypeManager.selectListType();
    }
}
