package com.mhc.challenger.core.biz.service;

import com.mhc.challenger.dal.domain.AssetOneAssetType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssetOneAssetTypeServiceTest {

    @Autowired
    AssetOneAssetTypeService assetOneAssetTypeService;

    @Test
    public void selectListType(){
        List<AssetOneAssetType> assetOneAssetTypeList=assetOneAssetTypeService.selectListType();
        System.out.println(assetOneAssetTypeList);
    }
}
