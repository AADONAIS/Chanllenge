package com.mhc.challenger.core.biz.service;

import com.mhc.challenger.dal.domain.AssetOneAsset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssetOneAssetServiceTest {

    @Autowired
    private AssetOneAssetService assetOneAssetService;

    @Test
    public void selectListAssets() {
        List<AssetOneAsset> assetOneAssets = assetOneAssetService.selectListAssets();
        System.out.println(assetOneAssets);
    }
}