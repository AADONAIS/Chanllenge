package com.mhc.challenger.test.service;

import com.mhc.challenger.core.biz.service.AssetOneAssetCatalogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AssetOneAssetCatalogServiceTest {

    @Autowired
    AssetOneAssetCatalogService assetOneAssetCatalogService;
    @Test
    public void Test(){
        assetOneAssetCatalogService.selectListAssetCatalog().forEach(a->System.out.print(a.toString()));
    }
}
