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

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.mhc.challenger.dal.domain.AssetOneAsset;
import com.mhc.challenger.dal.domain.AssetOneAssetCatalog;
import com.mhc.challenger.dal.dao.AssetOneAssetCatalogDao;
import com.mhc.challenger.dal.manager.AssetOneAssetCatalogManager;
import com.mhc.framework.common.base.dal.BaseManagerImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/**   
 * <p> 资产目录表 Manager实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@Component
public class AssetOneAssetCatalogManagerImpl extends BaseManagerImpl<AssetOneAssetCatalogDao, AssetOneAssetCatalog> implements AssetOneAssetCatalogManager {

    @Autowired
    AssetOneAssetCatalogDao assetOneAssetCatalogDao;

    @Override
    public List<AssetOneAssetCatalog> selectListAssetCatalog() {
        return assetOneAssetCatalogDao.selectListAssetCatalog();
    }

    @Override
    public AssetOneAssetCatalog selectByIdcatalog(int id){
        return assetOneAssetCatalogDao.selectByIdcatalog(id);
    }
}
