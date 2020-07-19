package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrder;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgOrderDetailExample;
import com.sc.entity.CgOrderExample;
import com.sc.entity.CgOrderExample.Criteria;
import com.sc.entity.CgPurchase;
import com.sc.entity.CgPurchaseExample;
import com.sc.entity.CgSupplier;
import com.sc.entity.CgSupplierExample;
import com.sc.mapper.CgOrderDetailMapper;
import com.sc.mapper.CgOrderMapper;
import com.sc.mapper.CgPurchaseMapper;
import com.sc.mapper.CgSupplierMapper;
import com.sc.service.CgService;

@Service
public class CgServiceImpl implements CgService {

	@Autowired
	CgOrderMapper cgOrderMapper;

	// 采购单相关方法
	@Override
	public List<CgOrder> selectOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<CgOrder> selectOrderPage(Integer pageNum, Integer pageSize, CgOrder co) {
		PageHelper.startPage(pageNum, pageSize);
		CgOrderExample cgOrderExample = new CgOrderExample();
		if (co != null) {
			Criteria criteria = cgOrderExample.createCriteria();
			if (!StringUtils.isEmpty(co.getOrderTheme())) {// 采购主题模糊查询
				criteria.andOrderThemeLike("%" + co.getOrderTheme() + "%");
			}
			if (!StringUtils.isEmpty(co.getOrderDatemin())) {// 采购日期时间大于等于最小日期
				System.out.println("---采购日期小---" + co.getOrderDatemin());
				criteria.andOrderBydateGreaterThanOrEqualTo(co.getOrderDatemin());
			}
			if (!StringUtils.isEmpty(co.getOrderDatemax())) {// 采购日期时间小于等于最大日期
				Date d = co.getOrderDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("---采购日期大---" + co.getOrderDatemax());
				criteria.andOrderBydateLessThanOrEqualTo(d);
			}
		}
		List<CgOrder> list = cgOrderMapper.selectByExample(cgOrderExample);
		PageInfo<CgOrder> page = new PageInfo<CgOrder>(list);
		return page;
	}

	@Override
	public CgOrder selectByPrimaryKey(Long orderId) {// 通过采购单编号查询采购单
		if (orderId != null) {
			return cgOrderMapper.selectByPrimaryKey(orderId);
		}
		return null;
	}

	@Override
	public void addOrder(CgOrder co) {
		cgOrderMapper.insert(co);

	}

	@Override
	public void updateOrder(CgOrder co) {
		if (co != null && co.getOrderId() != null) {
			cgOrderMapper.updateByPrimaryKey(co);
		}
	}

	@Override
	public void updateOrderispay(CgOrder co) {
		if (co.getOrderId() != null && co.getOrderIspya() != null) {// 单独修改OrderIspya状态
			CgOrderExample cgOrderExample = new CgOrderExample();
			Criteria criteria = cgOrderExample.createCriteria();
			if (co.getOrderIspya().equals("no")) {
				System.out.println("未付款状态更改为已付款状态！");
				criteria.andOrderIdEqualTo(co.getOrderId());
				co.setOrderIspya("yes");
				cgOrderMapper.updateByExampleSelective(co, cgOrderExample);
			} 
		}
	}

	@Override
	public void deleteOrder(Long orderId) {
		if (orderId != null) {
			cgOrderMapper.deleteByPrimaryKey(orderId);
		}
	}

	// 需补货产品相关方法
	@Autowired
	CgPurchaseMapper cgPurchaseMapper;

	@Override
	public void deletePurchase(Long purchaseId) {
		if (purchaseId != null) {
			cgPurchaseMapper.deleteByPrimaryKey(purchaseId);
		}
	}

	@Override
	public PageInfo<CgPurchase> selectPurchasePage(Integer pageNum, Integer pageSize, CgPurchase cp) {
		PageHelper.startPage(pageNum, pageSize);
		CgPurchaseExample cgPurchaseExample = new CgPurchaseExample();
		if (cp != null) {
			com.sc.entity.CgPurchaseExample.Criteria criteria = cgPurchaseExample.createCriteria();
			if (!StringUtils.isEmpty(cp.getCpDatemin())) {// 需补货产品产生时间大于等于最小时间
				System.out.println("需补货产品交货最小时间----" + cp.getCpDatemin());
				criteria.andOrderDeliveryDateGreaterThanOrEqualTo(cp.getCpDatemin());
			}
			if (!StringUtils.isEmpty(cp.getCpDatemax())) {
				Date d = cp.getCpDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);

				System.out.println("需补货产品交货最大时间----" + cp.getCpDatemax());
				criteria.andOrderDeliveryDateLessThanOrEqualTo(d);
			}
			if(!StringUtils.isEmpty(cp.getPurchaseId())){
				System.out.println("需补货产品id" + cp.getPurchaseId());
				criteria.andPurchaseIdEqualTo(cp.getPurchaseId());
				cgPurchaseMapper.selectByExample(cgPurchaseExample);
			}
		}

		List<CgPurchase> list = cgPurchaseMapper.selectByExample(cgPurchaseExample);
		PageInfo<CgPurchase> cppage = new PageInfo<CgPurchase>(list);
		return cppage;
	}

	@Override
	public List<CgPurchase> selectPurchase() {

		return null;
	}

	@Override
	public CgPurchase cpselectByPrimaryKey(Long purchaseId) {
		if (purchaseId != null) {
			return cgPurchaseMapper.selectByPrimaryKey(purchaseId);
		}
		return null;
	}

	@Override
	public void updatePurchase(CgPurchase cp) {
		if (cp != null && cp.getPurchaseId() != null) {
			cgPurchaseMapper.updateByPrimaryKey(cp);
		}

	}
	
	

	@Override
	public void addPurchase(CgPurchase cp) {
		cgPurchaseMapper.insert(cp);

	}

	// 采购单详情相关方法
	@Autowired
	CgOrderDetailMapper cgOrderDetailMapper;

	@Override
	public List<CgOrderDetail> selectOrderDetail(Long orderId) {
		if (!StringUtils.isEmpty(orderId)) {
			CgOrderDetailExample cgOrderDetailExample = new CgOrderDetailExample();
			CgOrderDetailExample.Criteria criteria = cgOrderDetailExample.createCriteria();
			System.out.println("进入通过OrderId查询订单详情");
			criteria.andOrderIdEqualTo(orderId);
			return cgOrderDetailMapper.selectByExample(cgOrderDetailExample);
		}
		return null;
	}

	@Override
	public CgOrderDetail selectOrderDetail1(CgOrderDetail cd) {
		CgOrderDetail dat=null;
		CgOrderDetailExample cgOrderDetailExample = new CgOrderDetailExample();
		CgOrderDetailExample.Criteria criteria = cgOrderDetailExample.createCriteria();
		if (!StringUtils.isEmpty(cd)) {
			if (!StringUtils.isEmpty(cd.getOrderId())) {
				criteria.andOrderIdEqualTo(cd.getOrderId());
			}
		}
		List<CgOrderDetail> list = cgOrderDetailMapper.selectByExample(cgOrderDetailExample);
		
		if(list.size()>0&&list!=null){
			dat=list.get(0);
		}
		
		return dat;
	}

	@Override
	public PageInfo<CgOrderDetail> selectOrderDetailPage(Integer pageNum, Integer pageSize, CgOrderDetail cod) {
		PageHelper.startPage(pageNum, pageSize);
		CgOrderDetailExample cgOrderDetailExample = new CgOrderDetailExample();
		if (cod != null) {
			CgOrderDetailExample.Criteria criteria = cgOrderDetailExample.createCriteria();
			if (!StringUtils.isEmpty(cod.getCodDatemin())) {
				System.out.println("订单详情最小时间----" + cod.getCodDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(cod.getCodDatemin());
			}
			if (!StringUtils.isEmpty(cod.getCodDatemax())) {
				Date d = cod.getCodDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);

				System.out.println("订单详情最大时间----" + cod.getCodDatemax());
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
			if (!StringUtils.isEmpty(cod.getOrderDetailId())) {
				System.out.println("进入通过OrderDetailId查询订单详情");
				criteria.andOrderDetailIdEqualTo(cod.getOrderDetailId());
				cgOrderDetailMapper.selectByExample(cgOrderDetailExample);
			}
		}
		List<CgOrderDetail> list = cgOrderDetailMapper.selectByExample(cgOrderDetailExample);
		PageInfo<CgOrderDetail> codpage = new PageInfo<CgOrderDetail>(list);
		return codpage;
	}

	@Override
	public void deleteOrderDetail(Long orderDetailId) {
		if (orderDetailId != null) {
			cgOrderDetailMapper.deleteByPrimaryKey(orderDetailId);
		}
	}

	@Override
	public void addOrderDetail(CgOrderDetail cod) {
		cgOrderDetailMapper.insert(cod);

	}

	@Override
	public void updateOrderDetail(CgOrderDetail cod) {
		if (cod != null && cod.getOrderDetailId() != null) {
			cgOrderDetailMapper.updateByPrimaryKey(cod);
		}

	}
	
	@Override
	public void updateproductWarehousing(CgOrderDetail cod) {
		if(cod.getOrderDetailId()!=null&&cod.getProductWarehousing()!=null){
			CgOrderDetailExample cgOrderDetailExample = new CgOrderDetailExample();
			CgOrderDetailExample.Criteria criteria = cgOrderDetailExample.createCriteria();
			if(cod.getProductWarehousing().equalsIgnoreCase("no")){//单独修改商品入库状态
				System.out.println("更改采购商品为入库状态");
				criteria.andOrderDetailIdEqualTo(cod.getOrderDetailId());
				cod.setProductWarehousing("yes");
				cgOrderDetailMapper.updateByExampleSelective(cod, cgOrderDetailExample);
			}
		}
		
	}

	@Override
	public CgOrderDetail codselectByPrimaryKey(Long orderDetailId) {
		if (orderDetailId != null) {
			return cgOrderDetailMapper.selectByPrimaryKey(orderDetailId);
		}
		return null;
	}

	// 供应商管理方法
	@Autowired
	CgSupplierMapper cgSupplierMapper;

	@Override
	public List<CgSupplier> selectSupplier() {
		System.out.println("查询供应商的id和简称");
		CgSupplierExample cgSupplierExample = new CgSupplierExample();
		CgSupplierExample.Criteria criteria = cgSupplierExample.createCriteria();
		
		return null;
	}

	@Override
	public void addSupplier(CgSupplier cs) {
		cgSupplierMapper.insert(cs);

	}

	@Override
	public void updateSupplier(CgSupplier cs) {
		if (cs != null && cs.getSupplierId() != null) {
			cgSupplierMapper.updateByPrimaryKey(cs);
		}

	}
	
	@Override
	public void updateSupplierEffective(CgSupplier cs) {
		if(cs.getSupplierId()!=null&&cs.getSupplierEffective()!=null){// 单独修改供应商有效状态
			CgSupplierExample cgSupplierExample = new CgSupplierExample();
			CgSupplierExample.Criteria criteria = cgSupplierExample.createCriteria();
			if(cs.getSupplierEffective().equalsIgnoreCase("no")){
				System.out.println("将供应商无效状态改为有效！");
				criteria.andSupplierIdEqualTo(cs.getSupplierId());
				cs.setSupplierEffective("yes");
				cgSupplierMapper.updateByExampleSelective(cs, cgSupplierExample);
		}
		}
				
	}

	@Override
	public void deleteSupplier(Long supplierId) {
		if (supplierId != null) {
			cgSupplierMapper.deleteByPrimaryKey(supplierId);
		}
	}

	@Override
	public PageInfo<CgSupplier> selectSupplierPage(Integer pageNum, Integer pageSize, CgSupplier cs) {
		PageHelper.startPage(pageNum, pageSize);
		CgSupplierExample cgSupplierExample = new CgSupplierExample();
		if (cs != null) {
			CgSupplierExample.Criteria criteria = cgSupplierExample.createCriteria();
			if (!StringUtils.isEmpty(cs.getSupplierFname())) {
				System.out.println("供应商简称模糊查询---" + cs.getSupplierFname());
				criteria.andSupplierFnameLike("%" + cs.getSupplierFname() + "%");
			}
			if (!StringUtils.isEmpty(cs.getCsDatemin())) {
				System.out.println("供应商管理最后操作时间最小值---" + cs.getCsDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(cs.getCsDatemin());
			}
			if (!StringUtils.isEmpty(cs.getCsDatemax())) {
				Date d = cs.getCsDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("供应商管理最后操作时间最大值---" + cs.getCsDatemax());
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		List<CgSupplier> list = cgSupplierMapper.selectByExample(cgSupplierExample);
		PageInfo<CgSupplier> cspage = new PageInfo<CgSupplier>(list);
		return cspage;
	}

	@Override
	public CgSupplier cgselectByPrimaryKey(Long supplierId) {
		if (supplierId != null) {
			return cgSupplierMapper.selectByPrimaryKey(supplierId);
		}
		return null;
	}

	

}
