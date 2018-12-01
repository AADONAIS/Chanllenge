/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.dal.domain
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.dal.domain;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.mhc.framework.common.base.dal.BaseModel;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**   
 * <p> 资产目录表 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@TableName("asset_one_asset_catalog")
public class AssetOneAssetCatalog extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 资产目录id
     */
	@TableId(value="asset_catalog_id", type= IdType.AUTO)
	private Integer assetCatalogId;
    /**
     * 资产编号
     */
	@TableField("asset_catalog_directory_num")
	private String assetCatalogDirectoryNum;
    /**
     * 资产类型
     */
	@TableField("asset_catalog_type")
	private String assetCatalogType;
    /**
     * 资产品牌
     */
	@TableField("asset_catalog_brand")
	private String assetCatalogBrand;
    /**
     * 资产型号
     */
	@TableField("asset_catalog_version")
	private String assetCatalogVersion;
    /**
     * 资产备注
     */
	@TableField("asset_catalog_remark")
	private String assetCatalogRemark;
    /**
     * 创建时间
     */
	@TableField("asset_catalog_gmt_create")
	private Date assetCatalogGmtCreate;
    /**
     * 修改时间
     */
	@TableField("asset_catalog_gmt_modified")
	private Date assetCatalogGmtModified;
    /**
     * 逻辑删除,1 表示成功，0表示正常
     */
	@TableField("asset_catalog_status")
	private Integer assetCatalogStatus;


	public Integer getAssetCatalogId() {
		return assetCatalogId;
	}

	public void setAssetCatalogId(Integer assetCatalogId) {
		this.assetCatalogId = assetCatalogId;
	}

	public String getAssetCatalogDirectoryNum() {
		return assetCatalogDirectoryNum;
	}

	public void setAssetCatalogDirectoryNum(String assetCatalogDirectoryNum) {
		this.assetCatalogDirectoryNum = assetCatalogDirectoryNum;
	}

	public String getAssetCatalogType() {
		return assetCatalogType;
	}

	public void setAssetCatalogType(String assetCatalogType) {
		this.assetCatalogType = assetCatalogType;
	}

	public String getAssetCatalogBrand() {
		return assetCatalogBrand;
	}

	public void setAssetCatalogBrand(String assetCatalogBrand) {
		this.assetCatalogBrand = assetCatalogBrand;
	}

	public String getAssetCatalogVersion() {
		return assetCatalogVersion;
	}

	public void setAssetCatalogVersion(String assetCatalogVersion) {
		this.assetCatalogVersion = assetCatalogVersion;
	}

	public String getAssetCatalogRemark() {
		return assetCatalogRemark;
	}

	public void setAssetCatalogRemark(String assetCatalogRemark) {
		this.assetCatalogRemark = assetCatalogRemark;
	}

	public Date getAssetCatalogGmtCreate() {
		return assetCatalogGmtCreate;
	}

	public void setAssetCatalogGmtCreate(Date assetCatalogGmtCreate) {
		this.assetCatalogGmtCreate = assetCatalogGmtCreate;
	}

	public Date getAssetCatalogGmtModified() {
		return assetCatalogGmtModified;
	}

	public void setAssetCatalogGmtModified(Date assetCatalogGmtModified) {
		this.assetCatalogGmtModified = assetCatalogGmtModified;
	}

	public Integer getAssetCatalogStatus() {
		return assetCatalogStatus;
	}

	public void setAssetCatalogStatus(Integer assetCatalogStatus) {
		this.assetCatalogStatus = assetCatalogStatus;
	}


	@Override
	public String toString() {
		return "AssetOneAssetCatalog{" +
			"assetCatalogId=" + assetCatalogId +
			", assetCatalogDirectoryNum=" + assetCatalogDirectoryNum +
			", assetCatalogType=" + assetCatalogType +
			", assetCatalogBrand=" + assetCatalogBrand +
			", assetCatalogVersion=" + assetCatalogVersion +
			", assetCatalogRemark=" + assetCatalogRemark +
			", assetCatalogGmtCreate=" + assetCatalogGmtCreate +
			", assetCatalogGmtModified=" + assetCatalogGmtModified +
			", assetCatalogStatus=" + assetCatalogStatus +
			"}";
	}

	//@Override
	//public String toString() {
	//	return ReflectionToStringBuilder.toString(this);
	//}
}