package com.mhc.challenger.test.dal;

import com.mhc.challenger.dal.domain.AssetOneAsset;
import com.mhc.challenger.dal.manager.AssetOneAssetManager;
import com.mhc.challenger.dal.manager.impl.AssetOneAssetCatalogManagerImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.mhc.challenger.dal.domain.AssetOneAssetCatalog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssetsCatalogTest {

    @Autowired
    private AssetOneAssetManager assetOneAssetManager;

    @Test
    public void test(){
        List<AssetOneAsset> assetOneAssets = assetOneAssetManager.selectListAssets();


//        aoaclist=assetsTest.selectList();

        System.out.println(assetOneAssets);
    }
}
