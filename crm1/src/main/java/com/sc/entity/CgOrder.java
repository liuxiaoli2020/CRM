package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CgOrder implements Serializable {
    private Long orderId;

    private String orderTheme;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderBydate;

    private String supplierId;

    private Long orderLoan;

    private BigDecimal invoiceId;

    private String orderIspya;

    private String orderProgress;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderDeliveryDate;
    
    //拓展属性，用于查询-start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderDatemin;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderDatemax;
    

    public Date getOrderDatemin() {
		return orderDatemin;
	}

	public void setOrderDatemin(Date orderDatemin) {
		this.orderDatemin = orderDatemin;
	}

	public Date getOrderDatemax() {
		return orderDatemax;
	}

	public void setOrderDatemax(Date orderDatemax) {
		this.orderDatemax = orderDatemax;
	}
	//拓展属性，用于查询-end
	
	//拓展属性，用于批量删除-start
	private Long[] orderIds;
	
	public Long[] getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(Long[] orderIds) {
		this.orderIds = orderIds;
	}
	//拓展属性，用于批量删除-end
	
	private String orderDeliveryPalce;

    private String orderDeliveryMode;

    private Long staffId;

    private String orderRemark;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public CgOrder(Long orderId, String orderTheme, Date orderBydate, String supplierId, Long orderLoan, BigDecimal invoiceId, String orderIspya, String orderProgress, Date orderDeliveryDate, String orderDeliveryPalce, String orderDeliveryMode, Long staffId, String orderRemark, Long companyId, Date lastModifyDate) {
        this.orderId = orderId;
        this.orderTheme = orderTheme;
        this.orderBydate = orderBydate;
        this.supplierId = supplierId;
        this.orderLoan = orderLoan;
        this.invoiceId = invoiceId;
        this.orderIspya = orderIspya;
        this.orderProgress = orderProgress;
        this.orderDeliveryDate = orderDeliveryDate;
        this.orderDeliveryPalce = orderDeliveryPalce;
        this.orderDeliveryMode = orderDeliveryMode;
        this.staffId = staffId;
        this.orderRemark = orderRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgOrder() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderTheme() {
        return orderTheme;
    }

    public void setOrderTheme(String orderTheme) {
        this.orderTheme = orderTheme == null ? null : orderTheme.trim();
    }

    public Date getOrderBydate() {
        return orderBydate;
    }

    public void setOrderBydate(Date orderBydate) {
        this.orderBydate = orderBydate;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public Long getOrderLoan() {
        return orderLoan;
    }

    public void setOrderLoan(Long orderLoan) {
        this.orderLoan = orderLoan;
    }

    public BigDecimal getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(BigDecimal invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getOrderIspya() {
        return orderIspya;
    }

    public void setOrderIspya(String orderIspya) {
        this.orderIspya = orderIspya == null ? null : orderIspya.trim();
    }

    public String getOrderProgress() {
        return orderProgress;
    }

    public void setOrderProgress(String orderProgress) {
        this.orderProgress = orderProgress == null ? null : orderProgress.trim();
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public void setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public String getOrderDeliveryPalce() {
        return orderDeliveryPalce;
    }

    public void setOrderDeliveryPalce(String orderDeliveryPalce) {
        this.orderDeliveryPalce = orderDeliveryPalce == null ? null : orderDeliveryPalce.trim();
    }

    public String getOrderDeliveryMode() {
        return orderDeliveryMode;
    }

    public void setOrderDeliveryMode(String orderDeliveryMode) {
        this.orderDeliveryMode = orderDeliveryMode == null ? null : orderDeliveryMode.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
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
		return "CgOrder [orderId=" + orderId + ", orderTheme=" + orderTheme + ", orderBydate=" + orderBydate
				+ ", supplierId=" + supplierId + ", orderLoan=" + orderLoan + ", invoiceId=" + invoiceId
				+ ", orderIspya=" + orderIspya + ", orderProgress=" + orderProgress + ", orderDeliveryDate="
				+ orderDeliveryDate + ", orderDeliveryPalce=" + orderDeliveryPalce + ", orderDeliveryMode="
				+ orderDeliveryMode + ", staffId=" + staffId + ", orderRemark=" + orderRemark + ", companyId="
				+ companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}