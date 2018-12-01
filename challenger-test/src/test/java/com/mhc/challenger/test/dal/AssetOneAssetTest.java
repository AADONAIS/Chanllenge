package com.mhc.challenger.test.dal;

import com.mhc.challenger.dal.domain.AssetOneAsset;
import com.mhc.challenger.dal.manager.AssetOneAssetManager;
import com.mhc.challenger.dal.manager.impl.AssetOneAssetManagerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AssetOneAssetTest {

    @Autowired
    AssetOneAssetManager assetOneAssetManager;

    @Test
    public void selectListAssets(){
        int id=1;
//        AssetOneAsset assetOneAsset;
//        AssetOneAssetManagerImpl assetOneAssetManager=new AssetOneAssetManagerImpl();
//        assetOneAsset=assetOneAssetManager.selectByIdAsset(id);
//        System.out.print(assetOneAsset);
          assetOneAssetManager.selectListAssets().forEach(assetOneAsset -> { System.out.print(assetOneAsset.toString());});
//        List<AssetOneAsset> list=assetOneAssetManager.selectListAssets();
//        for (AssetOneAsset assetOneAsset :
//         list){
//            System.out.print(assetOneAsset);
//        }
    }

}
