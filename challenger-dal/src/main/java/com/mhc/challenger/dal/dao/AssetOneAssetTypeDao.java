/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.dal.dao
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.dal.dao;

import com.mhc.challenger.dal.domain.AssetOneAssetType;
import com.mhc.framework.common.base.dal.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**  
 * <p> 资产类型表 DAO接口 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@Repository
public interface AssetOneAssetTypeDao extends BaseDao<AssetOneAssetType> {

 /**
  * 查询所有资产类型所有结果
  * @return
  */
  List<AssetOneAssetType> selectListType();
}

