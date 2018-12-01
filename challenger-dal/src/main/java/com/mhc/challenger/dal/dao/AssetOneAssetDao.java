/**
 *  
 *  * All rights Reserved, Designed By www.maihaoche.com
 * <p>
 *  * @Package com.mhc.challenger.dal.dao
 *  * @author: 三帝（sandi@maihaoche.com）
 *  * @date: 2018-11-30 10:55:07
 *  * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 *  * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 *  
 */
package com.mhc.challenger.dal.dao;

import com.mhc.challenger.dal.domain.AssetOneAsset;
import com.mhc.framework.common.base.dal.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *   
 *  * <p> 固资台账表 DAO接口 </p>
 *   
 *  * @author: 三帝（sandi@maihaoche.com）
 *  * @date: 2018-11-30 10:55:07
 *
 * @since V1.0
 *  
 */
@Repository
public interface AssetOneAssetDao extends BaseDao<AssetOneAsset> {


    AssetOneAsset selectByIdAsset(int id);

    List<AssetOneAsset> selectListAssets();
}

