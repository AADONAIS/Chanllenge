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

import com.mhc.challenger.core.biz.service.AssetOneAssetService;
import com.mhc.challenger.dal.domain.AssetOneAsset;
import com.mhc.challenger.dal.domain.AssetOneAssetCatalog;
import com.mhc.challenger.dal.manager.AssetOneAssetManager;
import com.mhc.framework.common.base.biz.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**   
 * <p> 固资台账表 服务实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
@Service
public class AssetOneAssetServiceImpl extends BaseServiceImpl implements AssetOneAssetService {

    @Autowired
    private AssetOneAssetManager assetOneAssetManager;

    @Override
    public List<AssetOneAsset> selectListAssets() {
        return assetOneAssetManager.selectListAssets();
    }



}
