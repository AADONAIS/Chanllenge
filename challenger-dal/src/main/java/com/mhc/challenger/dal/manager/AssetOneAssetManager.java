/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.dal.manager
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.dal.manager;

import com.mhc.challenger.dal.domain.AssetOneAsset;
import com.mhc.framework.common.base.dal.BaseManager;

import java.util.List;

/**   
 * <p> 固资台账表 Manager接口 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */

public interface AssetOneAssetManager extends BaseManager<AssetOneAsset> {

    public AssetOneAsset selectByIdAsset(int id);

    List<AssetOneAsset> selectListAssets();
}
