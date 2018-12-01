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
 * <p> 资产类型表 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@TableName("asset_one_asset_type")
public class AssetOneAssetType extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 资产类型id
     */
	@TableId(value="asset_type_id", type= IdType.AUTO)
	private Integer assetTypeId;
    /**
     * 类型名称
     */
	@TableField("asset_type_name")
	private String assetTypeName;
    /**
     * 类型编码
     */
	@TableField("asset_type_unicode")
	private String assetTypeUnicode;
    /**
     * 类型状态
     */
	@TableField("asset_type_tstatus")
	private String assetTypeTstatus;
    /**
     * 类型描述
     */
	@TableField("asset_type_description")
	private String assetTypeDescription;
    /**
     * 创建时间
     */
	@TableField("asset_type_gmt_create")
	private Date assetTypeGmtCreate;
    /**
     * 修改时间
     */
	@TableField("asset_type_gmt_modified")
	private Date assetTypeGmtModified;
    /**
     * 逻辑删除
     */
	@TableField("asset_type_status")
	private Integer assetTypeStatus;


	public Integer getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(Integer assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public String getAssetTypeName() {
		return assetTypeName;
	}

	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public String getAssetTypeUnicode() {
		return assetTypeUnicode;
	}

	public void setAssetTypeUnicode(String assetTypeUnicode) {
		this.assetTypeUnicode = assetTypeUnicode;
	}

	public String getAssetTypeTstatus() {
		return assetTypeTstatus;
	}

	public void setAssetTypeTstatus(String assetTypeTstatus) {
		this.assetTypeTstatus = assetTypeTstatus;
	}

	public String getAssetTypeDescription() {
		return assetTypeDescription;
	}

	public void setAssetTypeDescription(String assetTypeDescription) {
		this.assetTypeDescription = assetTypeDescription;
	}

	public Date getAssetTypeGmtCreate() {
		return assetTypeGmtCreate;
	}

	public void setAssetTypeGmtCreate(Date assetTypeGmtCreate) {
		this.assetTypeGmtCreate = assetTypeGmtCreate;
	}

	public Date getAssetTypeGmtModified() {
		return assetTypeGmtModified;
	}

	public void setAssetTypeGmtModified(Date assetTypeGmtModified) {
		this.assetTypeGmtModified = assetTypeGmtModified;
	}

	public Integer getAssetTypeStatus() {
		return assetTypeStatus;
	}

	public void setAssetTypeStatus(Integer assetTypeStatus) {
		this.assetTypeStatus = assetTypeStatus;
	}


	@Override
	public String toString() {
		return "AssetOneAssetType{" +
			"assetTypeId=" + assetTypeId +
			", assetTypeName=" + assetTypeName +
			", assetTypeUnicode=" + assetTypeUnicode +
			", assetTypeTstatus=" + assetTypeTstatus +
			", assetTypeDescription=" + assetTypeDescription +
			", assetTypeGmtCreate=" + assetTypeGmtCreate +
			", assetTypeGmtModified=" + assetTypeGmtModified +
			", assetTypeStatus=" + assetTypeStatus +
			"}";
	}

	//@Override
	//public String toString() {
	//	return ReflectionToStringBuilder.toString(this);
	//}
}