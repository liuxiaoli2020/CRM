package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CgOrderDetail implements Serializable {
    private Long orderDetailId;

    private Long orderId;

    private Long productId;

    private BigDecimal productPrice;

    private Long productNum;

    private String productWarehousing;

    private Long staffId;

    private String orderaterRemark;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;
    
    //拓展属性，用于查询-start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date codDatemax;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date codDatemin;

	public Date getCodDatemax() {
		return codDatemax;
	}

	public void setCodDatemax(Date codDatemax) {
		this.codDatemax = codDatemax;
	}

	public Date getCodDatemin() {
		return codDatemin;
	}

	public void setCodDatemin(Date codDatemin) {
		this.codDatemin = codDatemin;
	}
	//拓展属性，用于查询-end

	//拓展属性，批量删除-start
    private Long[] orderDetailIds;

    public Long[] getOrderDetailIds() {
		return orderDetailIds;
	}

	public void setOrderDetailIds(Long[] orderDetailIds) {
		this.orderDetailIds = orderDetailIds;
	}
	//拓展属性，批量删除-end

	private static final long serialVersionUID = 1L;

    public CgOrderDetail(Long orderDetailId, Long orderId, Long productId, BigDecimal productPrice, Long productNum, String productWarehousing, Long staffId, String orderaterRemark, Long companyId, Date lastModifyDate) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productNum = productNum;
        this.productWarehousing = productWarehousing;
        this.staffId = staffId;
        this.orderaterRemark = orderaterRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgOrderDetail() {
        super();
    }

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Long getProductNum() {
        return productNum;
    }

    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }

    public String getProductWarehousing() {
        return productWarehousing;
    }

    public void setProductWarehousing(String productWarehousing) {
        this.productWarehousing = productWarehousing == null ? null : productWarehousing.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getOrderaterRemark() {
        return orderaterRemark;
    }

    public void setOrderaterRemark(String orderaterRemark) {
        this.orderaterRemark = orderaterRemark == null ? null : orderaterRemark.trim();
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
		return "CgOrderDetail [orderDetailId=" + orderDetailId + ", orderId=" + orderId + ", productId=" + productId
				+ ", productPrice=" + productPrice + ", productNum=" + productNum + ", productWarehousing="
				+ productWarehousing + ", staffId=" + staffId + ", orderaterRemark=" + orderaterRemark + ", companyId="
				+ companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}