package com.sc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrder;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgPurchase;
import com.sc.entity.CgSupplier;
import com.sc.entity.Message;
import com.sc.service.CgService;

@Controller
@RequestMapping("cgctrl")
public class CgController {

	//采购单相关方法
	@Autowired
	CgService cgService;
	@RequestMapping("/selectOrder.do")
	public ModelAndView selectOrder(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10") Integer pageSize,CgOrder co){
		
			System.out.println("进入订单查询方法！");
			PageInfo<CgOrder> page=cgService.selectOrderPage(pageNum, pageSize, co);
			mav.addObject("p", page);
			mav.addObject("co", co);
			mav.setViewName("Cg/Cg-Order");//WEB-INF/Cg/Cg-Order.jsp
			return mav;
	}
	
	@RequestMapping("/istrue.do")
	public boolean istrue(CgOrder co){

		return false;
	}
	
	@RequestMapping("/goaddOrder.do")
	public ModelAndView goAddOrder(ModelAndView mav,CgOrder co,CgSupplier cs){
		System.out.println("进入订单添加页面！"+co);
		
		//修改操作
		if(co.getOrderId()!=null){
			co=cgService.selectByPrimaryKey(co.getOrderId());
		}
		PageInfo<CgSupplier> page = cgService.selectSupplierPage(0, 0, cs);
		System.out.println(page);
		
		mav.addObject("o", page);
		mav.setViewName("Cg/CgOrder-add");
		mav.addObject("co", co);
		return mav;
	}
	
	@RequestMapping("/goOrderMore.do")
	public ModelAndView goOrderMore(ModelAndView mav,CgOrder co,CgOrderDetail cd){
		System.out.println("进入查看更多信息页面！"+co);
		if(co.getOrderId()!=null){
			co=cgService.selectByPrimaryKey(co.getOrderId());
			cd.setOrderId(co.getOrderId());//设置采购单详情的orderid，通过orderID查询采购单详情
			List<CgOrderDetail> cdd = cgService.selectOrderDetail(co.getOrderId());
			System.out.println(cdd);
			mav.addObject("cd", cdd);
		}
		mav.addObject("co", co);
		mav.setViewName("Cg/Cg-Order-More");
		return mav;
	}
	
	@RequestMapping("/goOrderMore1.do")
	public ModelAndView goOrderMore1(ModelAndView mav,CgOrder co,CgOrderDetail cd){
		CgOrder li = cgService.selectByPrimaryKey(cd.getOrderId());
		CgOrderDetail cdd = cgService.selectOrderDetail1(cd);
		mav.addObject("cd", cdd);
		mav.addObject("co", li);
		mav.setViewName("Cg/Cg-Order-More");
		return mav;
	}
	
	@RequestMapping("/addOrder.do")
	public Message addOrder(ModelAndView mav,CgOrder co){
		System.out.println("进入添加采购单"+co);
		if(co.getOrderId()!=null){//进入修改
			cgService.updateOrder(co);
		}else{//添加操作
			cgService.addOrder(co);
		}
		return new Message("1","success1","成功!1");
	}
	@RequestMapping("/updateOrderIspya.do")
	@ResponseBody
	public Message updateOrderIspya(ModelAndView mav,CgOrder co){
		if(co.getOrderId()!=null&&co.getOrderIspya()!=null){
			System.out.println("进入更改付款状态！");
			cgService.updateOrderispay(co);
		}	
		return new Message("23","scuccess23"," 成功删除！23");
	}
	
	@RequestMapping("/deleteOrder.do")
	@ResponseBody
	public Message deleteOrder(Long orderId){
		System.out.println("进入删除采购单方法"+orderId);
		cgService.deleteOrder(orderId);
		return new Message("2","scuccess2"," 成功删除！2");
	}
	
	@RequestMapping("/deleteallOrder.do")
	public String deleteAllOrder(Long[] orderIds){
		System.out.println("进入批量删除采购单方法"+Arrays.toString(orderIds));
		if(orderIds!=null&&orderIds.length>0){
			for (Long id : orderIds) {
				cgService.deleteOrder(id);
			}
		}
		return "redirect:selectOrder.do";
	}
	
	//供应商管理相关方法
	@RequestMapping("/selectSupplier.do")
	public ModelAndView selectSupplier(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10") Integer pageSize,CgSupplier cs){
		System.out.println("进入供应商查询方法!");
		PageInfo<CgSupplier> page=cgService.selectSupplierPage(pageNum, pageSize, cs);
		mav.addObject("csp", page);
		mav.addObject("cs", cs);
		mav.setViewName("Cg/Cg-Supplier");
		return mav;
	}
	
	@RequestMapping("/goaddSupplier.do")
	public ModelAndView goAddSupplier(ModelAndView mav,CgSupplier cs){
		System.out.println("进入添加页面！"+cs);
		
		//修改操作
		if(cs.getSupplierId()!=null){
			cs=cgService.cgselectByPrimaryKey(cs.getSupplierId());
		}
		mav.setViewName("Cg/Cg-Supplier-add");
		mav.addObject("cs", cs);
		return mav;
	}
	
	@RequestMapping("/goSupplierMore.do")
	public ModelAndView goSupplierMore(ModelAndView mav,CgSupplier cs){
		System.out.println("进入供应商查看更多信息页面！"+cs);
		if(cs.getSupplierId()!=null){
			cs=cgService.cgselectByPrimaryKey(cs.getSupplierId());
		}
		mav.setViewName("Cg/Cg-Supplier-More");
		mav.addObject("cs", cs);
		return mav;
	}
	
	@RequestMapping("/updateSupplierEffective.do")
	@ResponseBody
	public Message updateSupplierEffective(ModelAndView mav,CgSupplier cs){
		if(cs.getSupplierId()!=null&&cs.getSupplierEffective()!=null){
			System.out.println("进入更改供应商有效状态！");
			cgService.updateSupplierEffective(cs);
		}	
		return new Message("33","success33","成功33");
	}
	
	@RequestMapping("/addSupplier.do")
	@ResponseBody
	public Message addSipplier(ModelAndView mav,CgSupplier cs){
		System.out.println("进入供应商添加方法！"+cs);
		if(cs.getSupplierId()!=null){
			cgService.updateSupplier(cs);
		}else{
			cgService.addSupplier(cs);
		}
		return new Message("3","success3","成功3");
	}
	
	@RequestMapping("/deleteSupplier.do")
	@ResponseBody
	public Message deleteSupplier(Long supplierId){
		System.out.println("进入供应商删除方法！"+supplierId);
		cgService.deleteSupplier(supplierId);
		return new Message("4","success4","成功4");
	}
	
	@RequestMapping("/deleteAllSupplier.do")
	public String deleteAllSupplier(Long[] supplierIds){
		System.out.println("进入供应商批量删除方法！"+supplierIds);
		if(supplierIds!=null&&supplierIds.length>0){
			for (Long id : supplierIds) {
				cgService.deleteSupplier(id);
			}
		}
		return  "redirect:selectSupplier.do";
	}
	
	//订单详情管理方法
	@RequestMapping("/selectOrderDetail.do")//查询
	public ModelAndView selectOrderDetail(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10") Integer pageSize,CgOrderDetail cod){
		System.out.println("进入订单详情查询方法!");
		PageInfo<CgOrderDetail> orderDetailPage = cgService.selectOrderDetailPage(pageNum, pageSize, cod);
		mav.addObject("codp", orderDetailPage);
		mav.addObject("cod", cod);
		mav.setViewName("Cg/Cg-Order-Detail");
		return mav;
	}
	
	@RequestMapping("/goaddOrderDetail.do")//重定向到添加页面
	public ModelAndView goAddOrderDetail(ModelAndView mav,CgOrderDetail cod){
		System.out.println("进入订单详情添加页面！"+cod);
		
		//修改操作
		if(cod.getOrderDetailId()!=null){
			cod=cgService.codselectByPrimaryKey(cod.getOrderDetailId());
		}
		mav.addObject("cod", cod);
		mav.setViewName("Cg/Cg-Order-Detail-add");
		return mav;
	}
	
	@RequestMapping("/addOrderDetail.do")
	public Message addOrderDetail(ModelAndView mav,CgOrderDetail cod){
		System.out.println("进入订单详情添加方法！"+cod);
		if(cod.getOrderDetailId()!=null){
			cgService.updateOrderDetail(cod);
		}else{
			cgService.addOrderDetail(cod);
		}
		return new Message("5","success5","成功5");
	}
	
	@RequestMapping("/productWarehousing.do")
	@ResponseBody
	public Message updateproductWarehousing(ModelAndView mav,CgOrderDetail cod){
		System.out.println(cod.getOrderDetailId()+"----"+cod.getProductWarehousing());
		if(cod.getOrderDetailId()!=null&&cod.getProductWarehousing()!=null){
			System.out.println("进入更改补货入库状态！");
			cgService.updateproductWarehousing(cod);
		}	
		return new Message("61","success61","成功61");
	}
	
	@RequestMapping("/deleteOrderDetail.do")
	@ResponseBody
	public Message deleteOrderDetail(Long orderDetailId){
		System.out.println("进入采购单详情删除方法！"+orderDetailId);
		cgService.deleteOrderDetail(orderDetailId);
		return new Message("6","success6","成功6");
	}
	
	@RequestMapping("/deleteAllOrderDetail.do")
	public String deleteAllOrderDetail(Long[] orderDetailIds){
		System.out.println("进入采购单详情批量删除方法！"+orderDetailIds);
		if(orderDetailIds!=null&&orderDetailIds.length>0){
			for (Long id : orderDetailIds) {
				cgService.deleteOrderDetail(id);
			}
		}
		return "redirect:selectOrderDetail.do";
	}
	
	//需补货产品管理方法
	@RequestMapping("/selectPurchase.do")
	public ModelAndView selectPurchase(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10") Integer pageSize,CgPurchase cp){
		System.out.println("进入需补货产品查询方法!");
		 PageInfo<CgPurchase> purchasePage = cgService.selectPurchasePage(pageNum, pageSize, cp);
		mav.addObject("cpp", purchasePage);
		mav.addObject("cp", cp);
		mav.setViewName("Cg/Cg-Purchase");
		return mav;
	}
	
	@RequestMapping("/goaddPurchase.do")//重定向到添加页面
	public ModelAndView goAddPurchase(ModelAndView mav,CgPurchase cp){
		System.out.println("进入需补货产品添加页面！"+cp);
		
		//修改操作
		if(cp.getPurchaseId()!=null){
			cp=cgService.cpselectByPrimaryKey(cp.getPurchaseId());
		}
		mav.setViewName("Cg/Cg-Purchase-add");
		mav.addObject("cp", cp);
		return mav;
	}
	
	@RequestMapping("/addPurchase.do")
	public Message addPurchase(ModelAndView mav,CgPurchase cp){
		System.out.println("进入需补货产品添加方法！"+cp);
		if(cp.getPurchaseId()!=null){
			cgService.updatePurchase(cp);
		}else{
			cgService.addPurchase(cp);
		}
		return new Message("5","success5","成功5");
	}
	
	@RequestMapping("/deletePurchase.do")
	@ResponseBody
	public Message deletePurchase(Long purchaseId){
		System.out.println("进入需补货产品删除方法！"+purchaseId);
		cgService.deletePurchase(purchaseId);;
		return new Message("6","success6","成功6");
	}
	
	@RequestMapping("/deleteAllPurchase.do")
	public String deleteAllPurchase(Long[] purchaseIds){
		System.out.println("进入需补货产品批量删除方法！"+purchaseIds);
		if(purchaseIds!=null&&purchaseIds.length>0){
			for (Long id : purchaseIds) {
				cgService.deletePurchase(id);
			}
		}
		return "redirect:selectPurchase.do";
	}
}
