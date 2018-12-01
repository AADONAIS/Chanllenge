package com.mhc.challenger.core.biz.service;

import com.mhc.challenger.dal.domain.AssetOneAssetCatalog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssetOneAssetCatalogServiceTest {

    @Autowired
    AssetOneAssetCatalogService assetOneAssetCatalogService;

    @Test
    public void selectByIdcatalog(){
        int id=1;
        AssetOneAssetCatalog assetOneAssetCatalog=assetOneAssetCatalogService.selectByIdcatalog(id);
        System.out.println(assetOneAssetCatalog);
    }

}
