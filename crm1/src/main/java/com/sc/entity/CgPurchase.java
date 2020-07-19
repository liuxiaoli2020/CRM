package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CgPurchase implements Serializable {
    private Long purchaseId;

    private Long productId;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderDeliveryDate;

    private String purchaseState;

    private Long staffId;

    private String purchaseRemark;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;
    
    //拓展属性，用于查询-Start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date cpDatemin;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date cpDatemax;

    public Date getCpDatemin() {
		return cpDatemin;
	}

	public void setCpDatemin(Date cpDatemin) {
		this.cpDatemin = cpDatemin;
	}

	public Date getCpDatemax() {
		return cpDatemax;
	}

	public void setCpDatemax(Date cpDatemax) {
		this.cpDatemax = cpDatemax;
	}
	//拓展属性，用于查询-end

	//拓展属性，用于批量删除-start
    private Long[] purchaseIds;
    
	public Long[] getPurchaseIds() {
		return purchaseIds;
	}

	public void setPurchaseIds(Long[] purchaseIds) {
		this.purchaseIds = purchaseIds;
	}

	
	//拓展属性，用于批量删除-end
	private static final long serialVersionUID = 1L;

    public CgPurchase(Long purchaseId, Long productId, Date orderDeliveryDate, String purchaseState, Long staffId, String purchaseRemark, Long companyId, Date lastModifyDate) {
        this.purchaseId = purchaseId;
        this.productId = productId;
        this.orderDeliveryDate = orderDeliveryDate;
        this.purchaseState = purchaseState;
        this.staffId = staffId;
        this.purchaseRemark = purchaseRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgPurchase() {
        super();
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public void setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(String purchaseState) {
        this.purchaseState = purchaseState == null ? null : purchaseState.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getPurchaseRemark() {
        return purchaseRemark;
    }

    public void setPurchaseRemark(String purchaseRemark) {
        this.purchaseRemark = purchaseRemark == null ? null : purchaseRemark.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "CgPurchase [purchaseId=" + purchaseId + ", productId=" + productId + ", orderDeliveryDate="
				+ orderDeliveryDate + ", purchaseState=" + purchaseState + ", staffId=" + staffId + ", purchaseRemark="
				+ purchaseRemark + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}