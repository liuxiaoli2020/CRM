package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrder;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgPurchase;
import com.sc.entity.CgSupplier;

public interface CgService {

	//查询需补货产品表
	public List<CgPurchase> selectPurchase();
	
	public PageInfo<CgPurchase> selectPurchasePage(Integer pageNum,Integer pageSize,CgPurchase cp);
	
	public void addPurchase(CgPurchase cp);
	
	public void deletePurchase(Long purchaseId);
	
	public void updatePurchase(CgPurchase cp);
	
	public CgPurchase cpselectByPrimaryKey(Long purchaseId);
	
	//查询订单表
	public PageInfo<CgOrder> selectOrderPage(Integer pageNum,Integer pageSize,CgOrder co);
	
	public List<CgOrder> selectOrder();
	
	public void addOrder(CgOrder co);
	
	public void updateOrder(CgOrder co);
	
	public void updateOrderispay(CgOrder co);
	
	public void deleteOrder(Long orderId);
	
	public CgOrder selectByPrimaryKey(Long orderId);
	
	//查询订单详情表
	public List<CgOrderDetail> selectOrderDetail(Long orderId);
	
	public CgOrderDetail selectOrderDetail1(CgOrderDetail cd);
	
	public PageInfo<CgOrderDetail> selectOrderDetailPage(Integer pageNum,Integer pageSize,CgOrderDetail cod);
	
	public void addOrderDetail(CgOrderDetail cod);
	
	public void updateOrderDetail(CgOrderDetail cod);
	
	public void updateproductWarehousing(CgOrderDetail cod);
	
	public void deleteOrderDetail(Long orderDetailId);
	
	public CgOrderDetail codselectByPrimaryKey(Long orderDetailId);
	
	//查询供应商表
	public List<CgSupplier> selectSupplier();
	
	public PageInfo<CgSupplier> selectSupplierPage(Integer pageNum,Integer pageSize,CgSupplier cs);
	
	public void addSupplier(CgSupplier cs);
	
	public void updateSupplier(CgSupplier cs);
	
	public void updateSupplierEffective(CgSupplier cs);
	
	public void deleteSupplier(Long supplierId);
	
	public CgSupplier cgselectByPrimaryKey(Long supplierId);
	
}
