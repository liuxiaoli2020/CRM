package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XsUserLoss implements Serializable {
    private Long customerLossId;

    private Long customerId;

    private Long operatorId;

    private String treatmentMode;

    private String treatmentMeasures;

    private String isLoss;

    private Long company;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyData;

    private static final long serialVersionUID = 1L;

    public XsUserLoss(Long customerLossId, Long customerId, Long operatorId, String treatmentMode, String treatmentMeasures, String isLoss, Long company, Date lastModifyData) {
        this.customerLossId = customerLossId;
        this.customerId = customerId;
        this.operatorId = operatorId;
        this.treatmentMode = treatmentMode;
        this.treatmentMeasures = treatmentMeasures;
        this.isLoss = isLoss;
        this.company = company;
        this.lastModifyData = lastModifyData;
    }

    public XsUserLoss() {
        super();
    }

    public Long getCustomerLossId() {
        return customerLossId;
    }

    public void setCustomerLossId(Long customerLossId) {
        this.customerLossId = customerLossId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getTreatmentMode() {
        return treatmentMode;
    }

    public void setTreatmentMode(String treatmentMode) {
        this.treatmentMode = treatmentMode == null ? null : treatmentMode.trim();
    }

    public String getTreatmentMeasures() {
        return treatmentMeasures;
    }

    public void setTreatmentMeasures(String treatmentMeasures) {
        this.treatmentMeasures = treatmentMeasures == null ? null : treatmentMeasures.trim();
    }

    public String getIsLoss() {
        return isLoss;
    }

    public void setIsLoss(String isLoss) {
        this.isLoss = isLoss == null ? null : isLoss.trim();
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }

    public Date getLastModifyData() {
        return lastModifyData;
    }

    public void setLastModifyData(Date lastModifyData) {
        this.lastModifyData = lastModifyData;
    }

	@Override
	public String toString() {
		return "XsUserLoss [customerLossId=" + customerLossId + ", customerId=" + customerId + ", operatorId="
				+ operatorId + ", treatmentMode=" + treatmentMode + ", treatmentMeasures=" + treatmentMeasures
				+ ", isLoss=" + isLoss + ", company=" + company + ", lastModifyData=" + lastModifyData + "]";
	}
    
}