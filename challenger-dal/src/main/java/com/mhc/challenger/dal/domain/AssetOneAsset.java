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

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.mhc.framework.common.base.dal.BaseModel;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**   
 * <p> 固资台账表 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@TableName("asset_one_asset")
public class AssetOneAsset extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 固资表id

     */
    @TableId("asset_id")
	private Integer assetId;
    /**
     * 设备号
     */
	@TableField("asset_num")
	private String assetNum;
    /**
     * 固资来源
     */
	@TableField("asset_source")
	private String assetSource;
    /**
     * 固资供应商
     */
	@TableField("asset_supplier")
	private String assetSupplier;
    /**
     * 采购或租赁时间
     */
	@TableField("asset_purchase_or_rent_time")
	private Date assetPurchaseOrRentTime;
    /**
     * 原值/租金
     */
	@TableField("asset_origianl_value")
	private BigDecimal assetOrigianlValue;
    /**
     * 启用时间
     */
	@TableField("asset_start_time")
	private Date assetStartTime;
    /**
     * 租赁到期时间
     */
	@TableField("asset_end_time")
	private Date assetEndTime;
    /**
     * 领用审批编号
     */
	@TableField("asset_approval_num")
	private String assetApprovalNum;
    /**
     * 领用人
     */
	@TableField("asset_receive_man")
	private String assetReceiveMan;
    /**
     * 领用人岗位
     */
	@TableField("asset_position")
	private String assetPosition;
    /**
     * 领用人所属部门
     */
	@TableField("asset_department")
	private String assetDepartment;
    /**
     * 流转类型
     */
	@TableField("asset_transtype")
	private String assetTranstype;
    /**
     * 领用日期
     */
	@TableField("asset_receive_date")
	private Date assetReceiveDate;
    /**
     * 归还日期
     */
	@TableField("asset_return_date")
	private Date assetReturnDate;
    /**
     * 固资状态
     */
	@TableField("asset_astatus")
	private Integer assetAstatus;
    /**
     * 资产编号
     */
	@TableField("asset_assets_num")
	private String assetAssetsNum;
    /**
     * 固资类型
     */
	@TableField("asset_type")
	private String assetType;
    /**
     * 创建时间
     */
	@TableField("asset_gmt_create")
	private Date assetGmtCreate;
    /**
     * 修改时间
     */
	@TableField("asset_gmt_modified")
	private Date assetGmtModified;
    /**
     * 逻辑删除，1表示成功，0表示正常
     */
	@TableField("asset_status")
	private Integer assetStatus;


	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getAssetNum() {
		return assetNum;
	}

	public void setAssetNum(String assetNum) {
		this.assetNum = assetNum;
	}

	public String getAssetSource() {
		return assetSource;
	}

	public void setAssetSource(String assetSource) {
		this.assetSource = assetSource;
	}

	public String getAssetSupplier() {
		return assetSupplier;
	}

	public void setAssetSupplier(String assetSupplier) {
		this.assetSupplier = assetSupplier;
	}

	public Date getAssetPurchaseOrRentTime() {
		return assetPurchaseOrRentTime;
	}

	public void setAssetPurchaseOrRentTime(Date assetPurchaseOrRentTime) {
		this.assetPurchaseOrRentTime = assetPurchaseOrRentTime;
	}

	public BigDecimal getAssetOrigianlValue() {
		return assetOrigianlValue;
	}

	public void setAssetOrigianlValue(BigDecimal assetOrigianlValue) {
		this.assetOrigianlValue = assetOrigianlValue;
	}

	public Date getAssetStartTime() {
		return assetStartTime;
	}

	public void setAssetStartTime(Date assetStartTime) {
		this.assetStartTime = assetStartTime;
	}

	public Date getAssetEndTime() {
		return assetEndTime;
	}

	public void setAssetEndTime(Date assetEndTime) {
		this.assetEndTime = assetEndTime;
	}

	public String getAssetApprovalNum() {
		return assetApprovalNum;
	}

	public void setAssetApprovalNum(String assetApprovalNum) {
		this.assetApprovalNum = assetApprovalNum;
	}

	public String getAssetReceiveMan() {
		return assetReceiveMan;
	}

	public void setAssetReceiveMan(String assetReceiveMan) {
		this.assetReceiveMan = assetReceiveMan;
	}

	public String getAssetPosition() {
		return assetPosition;
	}

	public void setAssetPosition(String assetPosition) {
		this.assetPosition = assetPosition;
	}

	public String getAssetDepartment() {
		return assetDepartment;
	}

	public void setAssetDepartment(String assetDepartment) {
		this.assetDepartment = assetDepartment;
	}

	public String getAssetTranstype() {
		return assetTranstype;
	}

	public void setAssetTranstype(String assetTranstype) {
		this.assetTranstype = assetTranstype;
	}

	public Date getAssetReceiveDate() {
		return assetReceiveDate;
	}

	public void setAssetReceiveDate(Date assetReceiveDate) {
		this.assetReceiveDate = assetReceiveDate;
	}

	public Date getAssetReturnDate() {
		return assetReturnDate;
	}

	public void setAssetReturnDate(Date assetReturnDate) {
		this.assetReturnDate = assetReturnDate;
	}

	public Integer getAssetAstatus() {
		return assetAstatus;
	}

	public void setAssetAstatus(Integer assetAstatus) {
		this.assetAstatus = assetAstatus;
	}

	public String getAssetAssetsNum() {
		return assetAssetsNum;
	}

	public void setAssetAssetsNum(String assetAssetsNum) {
		this.assetAssetsNum = assetAssetsNum;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Date getAssetGmtCreate() {
		return assetGmtCreate;
	}

	public void setAssetGmtCreate(Date assetGmtCreate) {
		this.assetGmtCreate = assetGmtCreate;
	}

	public Date getAssetGmtModified() {
		return assetGmtModified;
	}

	public void setAssetGmtModified(Date assetGmtModified) {
		this.assetGmtModified = assetGmtModified;
	}

	public Integer getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(Integer assetStatus) {
		this.assetStatus = assetStatus;
	}


	@Override
	public String toString() {
		return "AssetOneAsset{" +
			"assetId=" + assetId +
			", assetNum=" + assetNum +
			", assetSource=" + assetSource +
			", assetSupplier=" + assetSupplier +
			", assetPurchaseOrRentTime=" + assetPurchaseOrRentTime +
			", assetOrigianlValue=" + assetOrigianlValue +
			", assetStartTime=" + assetStartTime +
			", assetEndTime=" + assetEndTime +
			", assetApprovalNum=" + assetApprovalNum +
			", assetReceiveMan=" + assetReceiveMan +
			", assetPosition=" + assetPosition +
			", assetDepartment=" + assetDepartment +
			", assetTranstype=" + assetTranstype +
			", assetReceiveDate=" + assetReceiveDate +
			", assetReturnDate=" + assetReturnDate +
			", assetAstatus=" + assetAstatus +
			", assetAssetsNum=" + assetAssetsNum +
			", assetType=" + assetType +
			", assetGmtCreate=" + assetGmtCreate +
			", assetGmtModified=" + assetGmtModified +
			", assetStatus=" + assetStatus +
			"}";
	}

	//@Override
	//public String toString() {
	//	return ReflectionToStringBuilder.toString(this);
	//}
}