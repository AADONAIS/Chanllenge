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
 * <p> 领用记录表 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0 
 */
@TableName("asset_one_asset_receive_record")
public class AssetOneAssetReceiveRecord extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 领用记录id
     */
	@TableId(value="receive_record_id", type= IdType.AUTO)
	private Integer receiveRecordId;
    /**
     * 领用日期
     */
	@TableField("receive_record_rent_time")
	private Date receiveRecordRentTime;
    /**
     * 流转类型
     */
	@TableField("receive_record_trans_type")
	private String receiveRecordTransType;
    /**
     * 领用审批编号
     */
	@TableField("receive_record_approval_num")
	private String receiveRecordApprovalNum;
    /**
     * 领用人
     */
	@TableField("receive_record_receive_man")
	private String receiveRecordReceiveMan;
    /**
     * 借归还时间
     */
	@TableField("receive_record_return_time")
	private Date receiveRecordReturnTime;
    /**
     * 备注
     */
	@TableField("receive_record_remark")
	private String receiveRecordRemark;
    /**
     * 创建时间
     */
	@TableField("receive_record_gmt_create")
	private Date receiveRecordGmtCreate;
    /**
     * 修改时间
     */
	@TableField("receive_record_gmt_modified")
	private Date receiveRecordGmtModified;
    /**
     * 逻辑删除,1 表示成功，0 表示正常
     */
	@TableField("receive_record_status")
	private Integer receiveRecordStatus;


	public Integer getReceiveRecordId() {
		return receiveRecordId;
	}

	public void setReceiveRecordId(Integer receiveRecordId) {
		this.receiveRecordId = receiveRecordId;
	}

	public Date getReceiveRecordRentTime() {
		return receiveRecordRentTime;
	}

	public void setReceiveRecordRentTime(Date receiveRecordRentTime) {
		this.receiveRecordRentTime = receiveRecordRentTime;
	}

	public String getReceiveRecordTransType() {
		return receiveRecordTransType;
	}

	public void setReceiveRecordTransType(String receiveRecordTransType) {
		this.receiveRecordTransType = receiveRecordTransType;
	}

	public String getReceiveRecordApprovalNum() {
		return receiveRecordApprovalNum;
	}

	public void setReceiveRecordApprovalNum(String receiveRecordApprovalNum) {
		this.receiveRecordApprovalNum = receiveRecordApprovalNum;
	}

	public String getReceiveRecordReceiveMan() {
		return receiveRecordReceiveMan;
	}

	public void setReceiveRecordReceiveMan(String receiveRecordReceiveMan) {
		this.receiveRecordReceiveMan = receiveRecordReceiveMan;
	}

	public Date getReceiveRecordReturnTime() {
		return receiveRecordReturnTime;
	}

	public void setReceiveRecordReturnTime(Date receiveRecordReturnTime) {
		this.receiveRecordReturnTime = receiveRecordReturnTime;
	}

	public String getReceiveRecordRemark() {
		return receiveRecordRemark;
	}

	public void setReceiveRecordRemark(String receiveRecordRemark) {
		this.receiveRecordRemark = receiveRecordRemark;
	}

	public Date getReceiveRecordGmtCreate() {
		return receiveRecordGmtCreate;
	}

	public void setReceiveRecordGmtCreate(Date receiveRecordGmtCreate) {
		this.receiveRecordGmtCreate = receiveRecordGmtCreate;
	}

	public Date getReceiveRecordGmtModified() {
		return receiveRecordGmtModified;
	}

	public void setReceiveRecordGmtModified(Date receiveRecordGmtModified) {
		this.receiveRecordGmtModified = receiveRecordGmtModified;
	}

	public Integer getReceiveRecordStatus() {
		return receiveRecordStatus;
	}

	public void setReceiveRecordStatus(Integer receiveRecordStatus) {
		this.receiveRecordStatus = receiveRecordStatus;
	}


	@Override
	public String toString() {
		return "AssetOneAssetReceiveRecord{" +
			"receiveRecordId=" + receiveRecordId +
			", receiveRecordRentTime=" + receiveRecordRentTime +
			", receiveRecordTransType=" + receiveRecordTransType +
			", receiveRecordApprovalNum=" + receiveRecordApprovalNum +
			", receiveRecordReceiveMan=" + receiveRecordReceiveMan +
			", receiveRecordReturnTime=" + receiveRecordReturnTime +
			", receiveRecordRemark=" + receiveRecordRemark +
			", receiveRecordGmtCreate=" + receiveRecordGmtCreate +
			", receiveRecordGmtModified=" + receiveRecordGmtModified +
			", receiveRecordStatus=" + receiveRecordStatus +
			"}";
	}

	//@Override
	//public String toString() {
	//	return ReflectionToStringBuilder.toString(this);
	//}
}