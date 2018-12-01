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
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.mhc.framework.common.base.dal.BaseModel;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**   
 * <p> 资产入库记录表，用于资产采购时的资产登记
 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@TableName("asset_one_asset_storage")
public class AssetOneAssetStorage extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 资产目录 id，自增长
     */
	@TableId(value="asset_storage_id", type= IdType.AUTO)
	private Integer assetStorageId;
    /**
     * 资产来源，来源分为：公司资产 和 租赁资产两种
     */
	@TableField("asset_storage_source")
	private String assetStorageSource;
    /**
     * 租金单位，公司资产专属字段
单位可选项，默认（元/月）：
元/月、月/天、月/季、月/年
     */
	@TableField("asset_storage_rent_unit")
	private String assetStorageRentUnit;
    /**
     * 原值，指采购资产的价值，单位为元
     */
	@TableField("asset_storage_original_value")
	private BigDecimal assetStorageOriginalValue;
    /**
     * 采购或租赁时间，来源为 公司资产的时候，这里显示采购时间。
租赁资产，则显示租赁开始时间

     */
	@TableField("asset_storage_purchase_time")
	private Date assetStoragePurchaseTime;
    /**
     * 供应商
     */
	@TableField("asset_storage_supplier")
	private String assetStorageSupplier;
    /**
     * 启用日期，设备开始使用的时间
     */
	@TableField("asset_storage_start_time")
	private Date assetStorageStartTime;
    /**
     * 租金，指资产租赁所需要的金额
     */
	@TableField("asset_storage_rent")
	private String assetStorageRent;
    /**
     * 租金开始时间
     */
	@TableField("asset_storage_rent_start_time")
	private Date assetStorageRentStartTime;
    /**
     * 租金结束时间
     */
	@TableField("asset_storage_rent_end_time")
	private Date assetStorageRentEndTime;
    /**
     * 创建时间
     */
	@TableField("asset_storage_gmt_create")
	private Date assetStorageGmtCreate;
    /**
     * 修改时间
     */
	@TableField("asset_storage_gmt_modified")
	private Date assetStorageGmtModified;
    /**
     * 逻辑删除位，1 表示成功，0 表示正常
     */
	@TableField("asset_storage_status")
	private Integer assetStorageStatus;


	public Integer getAssetStorageId() {
		return assetStorageId;
	}

	public void setAssetStorageId(Integer assetStorageId) {
		this.assetStorageId = assetStorageId;
	}

	public String getAssetStorageSource() {
		return assetStorageSource;
	}

	public void setAssetStorageSource(String assetStorageSource) {
		this.assetStorageSource = assetStorageSource;
	}

	public String getAssetStorageRentUnit() {
		return assetStorageRentUnit;
	}

	public void setAssetStorageRentUnit(String assetStorageRentUnit) {
		this.assetStorageRentUnit = assetStorageRentUnit;
	}

	public BigDecimal getAssetStorageOriginalValue() {
		return assetStorageOriginalValue;
	}

	public void setAssetStorageOriginalValue(BigDecimal assetStorageOriginalValue) {
		this.assetStorageOriginalValue = assetStorageOriginalValue;
	}

	public Date getAssetStoragePurchaseTime() {
		return assetStoragePurchaseTime;
	}

	public void setAssetStoragePurchaseTime(Date assetStoragePurchaseTime) {
		this.assetStoragePurchaseTime = assetStoragePurchaseTime;
	}

	public String getAssetStorageSupplier() {
		return assetStorageSupplier;
	}

	public void setAssetStorageSupplier(String assetStorageSupplier) {
		this.assetStorageSupplier = assetStorageSupplier;
	}

	public Date getAssetStorageStartTime() {
		return assetStorageStartTime;
	}

	public void setAssetStorageStartTime(Date assetStorageStartTime) {
		this.assetStorageStartTime = assetStorageStartTime;
	}

	public String getAssetStorageRent() {
		return assetStorageRent;
	}

	public void setAssetStorageRent(String assetStorageRent) {
		this.assetStorageRent = assetStorageRent;
	}

	public Date getAssetStorageRentStartTime() {
		return assetStorageRentStartTime;
	}

	public void setAssetStorageRentStartTime(Date assetStorageRentStartTime) {
		this.assetStorageRentStartTime = assetStorageRentStartTime;
	}

	public Date getAssetStorageRentEndTime() {
		return assetStorageRentEndTime;
	}

	public void setAssetStorageRentEndTime(Date assetStorageRentEndTime) {
		this.assetStorageRentEndTime = assetStorageRentEndTime;
	}

	public Date getAssetStorageGmtCreate() {
		return assetStorageGmtCreate;
	}

	public void setAssetStorageGmtCreate(Date assetStorageGmtCreate) {
		this.assetStorageGmtCreate = assetStorageGmtCreate;
	}

	public Date getAssetStorageGmtModified() {
		return assetStorageGmtModified;
	}

	public void setAssetStorageGmtModified(Date assetStorageGmtModified) {
		this.assetStorageGmtModified = assetStorageGmtModified;
	}

	public Integer getAssetStorageStatus() {
		return assetStorageStatus;
	}

	public void setAssetStorageStatus(Integer assetStorageStatus) {
		this.assetStorageStatus = assetStorageStatus;
	}


	@Override
	public String toString() {
		return "AssetOneAssetStorage{" +
			"assetStorageId=" + assetStorageId +
			", assetStorageSource=" + assetStorageSource +
			", assetStorageRentUnit=" + assetStorageRentUnit +
			", assetStorageOriginalValue=" + assetStorageOriginalValue +
			", assetStoragePurchaseTime=" + assetStoragePurchaseTime +
			", assetStorageSupplier=" + assetStorageSupplier +
			", assetStorageStartTime=" + assetStorageStartTime +
			", assetStorageRent=" + assetStorageRent +
			", assetStorageRentStartTime=" + assetStorageRentStartTime +
			", assetStorageRentEndTime=" + assetStorageRentEndTime +
			", assetStorageGmtCreate=" + assetStorageGmtCreate +
			", assetStorageGmtModified=" + assetStorageGmtModified +
			", assetStorageStatus=" + assetStorageStatus +
			"}";
	}

	//@Override
	//public String toString() {
	//	return ReflectionToStringBuilder.toString(this);
	//}
}