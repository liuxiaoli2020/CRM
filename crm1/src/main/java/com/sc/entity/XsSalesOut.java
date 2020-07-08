package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XsSalesOut implements Serializable {
    private Long salesOrderId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creatListDate;

    private String invoiceNumber;

    private Long customerId;

    private BigDecimal saleAmount;

    private String saleDeliveryStatus;

    private String isRebate;

    private String orderStatus;

    private String noteInformation;

    private Integer companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsSalesOut(Long salesOrderId, Date creatListDate, String invoiceNumber, Long customerId, BigDecimal saleAmount, String saleDeliveryStatus, String isRebate, String orderStatus, String noteInformation, Integer companyId, Date lastModifyDate) {
        this.salesOrderId = salesOrderId;
        this.creatListDate = creatListDate;
        this.invoiceNumber = invoiceNumber;
        this.customerId = customerId;
        this.saleAmount = saleAmount;
        this.saleDeliveryStatus = saleDeliveryStatus;
        this.isRebate = isRebate;
        this.orderStatus = orderStatus;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsSalesOut() {
        super();
    }

    public Long getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(Long salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public Date getCreatListDate() {
        return creatListDate;
    }

    public void setCreatListDate(Date creatListDate) {
        this.creatListDate = creatListDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getSaleDeliveryStatus() {
        return saleDeliveryStatus;
    }

    public void setSaleDeliveryStatus(String saleDeliveryStatus) {
        this.saleDeliveryStatus = saleDeliveryStatus == null ? null : saleDeliveryStatus.trim();
    }

    public String getIsRebate() {
        return isRebate;
    }

    public void setIsRebate(String isRebate) {
        this.isRebate = isRebate == null ? null : isRebate.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
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
		return "XsSalesOut [salesOrderId=" + salesOrderId + ", creatListDate=" + creatListDate + ", invoiceNumber="
				+ invoiceNumber + ", customerId=" + customerId + ", saleAmount=" + saleAmount + ", saleDeliveryStatus="
				+ saleDeliveryStatus + ", isRebate=" + isRebate + ", orderStatus=" + orderStatus + ", noteInformation="
				+ noteInformation + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}