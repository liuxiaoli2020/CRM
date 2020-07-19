package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class KcGoods implements Serializable {    

    @Override
	public String toString() {
		return "KcGoods [datemin=" + datemin + ", datemax=" + datemax + ", goodsId=" + goodsId + ", goodsName="
				+ goodsName + ", goodsKind=" + goodsKind + ", goodsExplain=" + goodsExplain + ", goodsUnit=" + goodsUnit
				+ ", depotId=" + depotId + ", stockNumber=" + stockNumber + ", goodsCost=" + goodsCost + ", goodsSale="
				+ goodsSale + ", goodsMiddle=" + goodsMiddle + ", remarkMessage=" + remarkMessage + ", companyId="
				+ companyId + ", lastModifiedTime=" + lastModifiedTime + "]";
	}

	//扩展属性，用于查询——start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax;    
    
	public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}

	public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}
	//扩展属性，用于查询——end

	private Long goodsId;

    private String goodsName;

    private String goodsKind;

    private String goodsExplain;

    private String goodsUnit;

    private String depotId;

    private String stockNumber;

    private String goodsCost;

    private String goodsSale;

    private String goodsMiddle;

    private String remarkMessage;

    private String companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifiedTime;

    private static final long serialVersionUID = 1L;

    public KcGoods(Long goodsId, String goodsName, String goodsKind, String goodsExplain, String goodsUnit, String depotId, String stockNumber, String goodsCost, String goodsSale, String goodsMiddle, String remarkMessage, String companyId, Date lastModifiedTime) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsKind = goodsKind;
        this.goodsExplain = goodsExplain;
        this.goodsUnit = goodsUnit;
        this.depotId = depotId;
        this.stockNumber = stockNumber;
        this.goodsCost = goodsCost;
        this.goodsSale = goodsSale;
        this.goodsMiddle = goodsMiddle;
        this.remarkMessage = remarkMessage;
        this.companyId = companyId;
        this.lastModifiedTime = lastModifiedTime;
    }

    public KcGoods() {
        super();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsKind() {
        return goodsKind;
    }

    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind == null ? null : goodsKind.trim();
    }

    public String getGoodsExplain() {
        return goodsExplain;
    }

    public void setGoodsExplain(String goodsExplain) {
        this.goodsExplain = goodsExplain == null ? null : goodsExplain.trim();
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId == null ? null : depotId.trim();
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber == null ? null : stockNumber.trim();
    }

    public String getGoodsCost() {
        return goodsCost;
    }

    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost == null ? null : goodsCost.trim();
    }

    public String getGoodsSale() {
        return goodsSale;
    }

    public void setGoodsSale(String goodsSale) {
        this.goodsSale = goodsSale == null ? null : goodsSale.trim();
    }

    public String getGoodsMiddle() {
        return goodsMiddle;
    }

    public void setGoodsMiddle(String goodsMiddle) {
        this.goodsMiddle = goodsMiddle == null ? null : goodsMiddle.trim();
    }

    public String getRemarkMessage() {
        return remarkMessage;
    }

    public void setRemarkMessage(String remarkMessage) {
        this.remarkMessage = remarkMessage == null ? null : remarkMessage.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}