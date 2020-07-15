package com.sc.controller;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.RsUserDetail;
import com.sc.service.RsUserDetailService;

@Controller
@RequestMapping("/staffctrl")

public class RsUserDetailController {
	
    @Autowired
    RsUserDetailService rsUserDetailService;
    
    @RequestMapping("/selectpage.do")
	public ModelAndView selectpage(ModelAndView mav,
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize){
    	PageInfo<RsUserDetail> pageInfo=this.rsUserDetailService.selectStaffPage(pageNum, pageSize);
    	mav.addObject("pi", pageInfo);
    	mav.setViewName("rs/stafflist");
		return mav;
	}
 
    @RequestMapping("/likeselect.do")
   	public ModelAndView likeselect(ModelAndView mav,RsUserDetail s,
   			@RequestParam(defaultValue="1") int pageNum,
   			@RequestParam(defaultValue="5") int pageSize,
   			@RequestParam(defaultValue="") String staffName){
       	PageInfo<RsUserDetail> pageInfo=this.rsUserDetailService.selectStaffName(pageNum, pageSize, staffName);
       	mav.addObject("pi", pageInfo);
       	mav.setViewName("rs/stafflist");
       /*	String isback="yes";
       	mav.setViewName("redirect:../rs/stafflist.jsp?isback="+isback);*/
   		return mav;
   	}
    
    @RequestMapping("/staffupdate.do")
   	public ModelAndView staffupdate(ModelAndView mav,RsUserDetail s){
       if (s.getStaffId()!=null) {
		s=rsUserDetailService.getRsUserDetail(s.getStaffId());
	}
    	mav.addObject("s",s );
       	mav.setViewName("rs/staffupdate");
   		return mav;
   	}
    @RequestMapping("/importphoto.do")
   	public ModelAndView importphoto(ModelAndView mav,String msg){
   	        mav.setViewName("rs/importphoto");
   	   		return mav;
   	 }
    @RequestMapping("/importphoto1.do")
    public ModelAndView importphoto1(ModelAndView mav,MultipartFile[] myfiles,HttpServletRequest req
  			,RsUserDetail s) {
    	if(myfiles!=null && myfiles.length>0){//文件对象
    		for(int i=0;i<myfiles.length;i++){
    			String name=myfiles[i].getOriginalFilename();//文件名称
    			if(name!=null&&!name.equals("")){//文件上传
      				String path=req.getServletContext().getRealPath("upload");//路径
      				File f=new File(path+"/"+name);//路径+文件名的文件对象
      				try {
      					myfiles[i].transferTo(f);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//另存为
      				
      				s.setStaffPhoto(name);
      			}
    		}
  			
  		}
    	
    	mav.setViewName("redirect:selectpage.do");
    	return mav;
	}
    
    @RequestMapping("/supdate.do")
    @ResponseBody
  	public Message supdate(ModelAndView mav,MultipartFile upload,HttpServletRequest req
  			,RsUserDetail s) 
  			throws IllegalStateException, IOException{
  		if(upload!=null){//文件对象
  			String name=upload.getOriginalFilename();//文件名称
  			if(name!=null&&!name.equals("")){//文件上传
  				String path=req.getServletContext().getRealPath("upload");//路径
  				File f=new File(path+"/"+name);//路径+文件名的文件对象
  				upload.transferTo(f);//另存为
  				
  				s.setStaffPhoto(name);
  			}
  		}
  		if (s.getStaffId()!=null) {
  			rsUserDetailService.updateRsUserDetails(s);
		}else {
			rsUserDetailService.addRsUserDetails(s);
		}
  		
  		//mav.setViewName("redirect:selectpage.do");
  		
  		//return mav;
  		return new Message("1", "success", "成功");
  	}
    
    @RequestMapping("/staffdelete.do")
   	public ModelAndView staffdelete(ModelAndView mav,RsUserDetail s){
       	
    	this.rsUserDetailService.deleteRsUserDetails(s);
       	mav.setViewName("redirect:selectpage.do");
   		return mav;
   	}
    
    //批量删除
    @RequestMapping("/deletemore.do")
    public ModelAndView deletemore(ModelAndView mav,HttpServletRequest req, HttpServletResponse res) {
		String items=req.getParameter("delitems");
    	String[] item=items.split(",");
    	for(int i=0;i<item.length;i++){
    		rsUserDetailService.deleteRsUserDetails(Long.parseLong(item[i]));
    	}
    	mav.setViewName("redirect:selectpage.do");
   		return mav;
	}
    
    @RequestMapping("/importstaff.do")
	public ModelAndView importstaff(ModelAndView mav,String msg){
	        mav.setViewName("rs/importstaff");
	   		return mav;
	 }
    
    
    @RequestMapping("/uploadfile.do")
    public ModelAndView uploadfile(ModelAndView mav,MultipartFile excelFile){
		//Map<String, String> ret = new HashMap<String, String>();
    	String msg = "";
		if(excelFile == null){
			msg="error1";
			mav.setViewName("redirect:../rs/importstaff.jsp?msg="+msg);
			return mav;
		}
		
		if(excelFile.getSize() > 5000000){
			//ret.put("type", "error");
			//ret.put("msg", "文件大小不要超过5M!");
			msg="error2";
			mav.setViewName("redirect:../rs/importstaff.jsp?msg="+msg);
			return mav;
		}
		String suffix = excelFile.getOriginalFilename().substring(excelFile.getOriginalFilename().lastIndexOf(".")+1, excelFile.getOriginalFilename().length());
		if(!"xls,xlsx".contains(suffix)){
			//ret.put("type", "error");
			//ret.put("msg", "请上传最新xls,xlsx格式的文件!");
			msg="error1";
			mav.setViewName("redirect:../rs/importstaff.jsp?msg="+msg);
			return mav;
		}
	    msg = "导入成功";
		try {
			msg = readExcel(excelFile.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if("".equals(msg))msg = "全部导入成功";
		//ret.put("type", "success");
		//ret.put("msg", msg);
		mav.setViewName("redirect:selectpage.do");
		return mav;
	}
    
    //读取excel文件，插入到数据库
    private String readExcel(InputStream fileInputStream){
		String msg = "";
		try {
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheetAt = xssfWorkbook.getSheetAt(0);
			if(sheetAt.getLastRowNum() <= 0){
				msg = "该文件为空";
			}
			for(int rowIndex = 1;rowIndex <= sheetAt.getLastRowNum(); rowIndex++){
				RsUserDetail rsUserDetail = new RsUserDetail();
				//Question question = new Question();
				XSSFRow row = sheetAt.getRow(rowIndex);
				
				rsUserDetail.setStaffId(null);
				rsUserDetail.setStaffName(row.getCell(1) == null ? "" : row.getCell(1).getStringCellValue());
				rsUserDetail.setStaffSex(row.getCell(2) == null ? "" : row.getCell(2).getStringCellValue());
				rsUserDetail.setStaffPhoto(row.getCell(3) == null ? "" : row.getCell(3).getStringCellValue());
				rsUserDetail.setIdNumber(row.getCell(4) == null ? "" : row.getCell(4).getStringCellValue());
				rsUserDetail.setHomeAddress(row.getCell(5) == null ? "" : row.getCell(5).getStringCellValue());
				rsUserDetail.setNowAddress(row.getCell(6) == null ? "" : row.getCell(6).getStringCellValue());
				rsUserDetail.setStaffEducation(row.getCell(7) == null ? "" : row.getCell(7).getStringCellValue());
				rsUserDetail.setPoliticalOutlook(row.getCell(8) == null ? "" : row.getCell(8).getStringCellValue());
				rsUserDetail.setGraduateSchool(row.getCell(9) == null ? "" : row.getCell(9).getStringCellValue());
				rsUserDetail.setTelephone(row.getCell(10) == null ? "" : row.getCell(10).getStringCellValue());
				rsUserDetail.setOnlineContactWay(row.getCell(11) == null ? "" : row.getCell(11).getStringCellValue());
				rsUserDetail.setOnlineContactDetail(row.getCell(12) == null ? "" : row.getCell(12).getStringCellValue());
				rsUserDetail.setAuditStatus(row.getCell(13) == null ? "" : row.getCell(13).getStringCellValue());
				rsUserDetail.setJobId(row.getCell(14) == null ? null : Long.parseLong(row.getCell(14).getStringCellValue()));
				rsUserDetail.setStaffState(row.getCell(15) == null ? "" : row.getCell(15).getStringCellValue());
				rsUserDetail.setNotes(row.getCell(16) == null ? "" : row.getCell(16).getStringCellValue());
				rsUserDetail.setCompanyId(row.getCell(17) == null ? null : Long.parseLong(row.getCell(17).getStringCellValue()));
				rsUserDetail.setLastModifyDate(row.getCell(18) == null ? null : new Date());
				rsUserDetailService.addRsUserDetails(rsUserDetail);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
}
