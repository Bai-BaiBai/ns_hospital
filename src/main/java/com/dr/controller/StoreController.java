package com.dr.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dr.pojo.Drug;
import com.dr.pojo.ExportStore;
import com.dr.pojo.Import_store;
import com.dr.pojo.Store;
import com.dr.service.DrugService;
import com.dr.service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Resource
	StoreService storeService;
	
	@Resource
	DrugService drugService;

	@RequestMapping("jumpIndex")
	public String jumpIndex(){
		return "StoreManage/index";
	}
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll(ModelAndView mav) throws Exception{
		ArrayList<Store> store = storeService.selectAll();
		mav.addObject("store", store);
		mav.setViewName("StoreManage/storeView");
		return mav;
	}
	
	@RequestMapping("/selectByName")
	public ModelAndView selectByName(ModelAndView mav, String drug_name)throws Exception{
		ArrayList<Store> store = storeService.selectByName(drug_name);
		mav.addObject("store", store);
		mav.setViewName("StoreManage/storeView");
		return mav;
	}
	
	@RequestMapping(value={"/importStore","/exportStore"})
	public ModelAndView storeManage(ModelAndView mav, HttpServletRequest req) throws Exception{
		String action = req.getRequestURI();
		ArrayList<Drug> drug = drugService.selectAll();
		mav.addObject("drug", drug);
		if("/store/importStore".equals(action)){
			mav.setViewName("StoreManage/importStore");
		}else if("/store/exportStore".equals(action)){
			mav.setViewName("StoreManage/exportStore");
		}
		
		return mav;
	}
	
	@RequestMapping("/doImportStore")
	public ModelAndView doImportStore(ModelAndView mav, Import_store import_store)throws Exception{
		if(storeService.findByDrugId(import_store.getDrugId())){
			//增加相应的库存数量
			storeService.importStore(import_store);
		}else{
			//增加一条新记录
			storeService.insertStore(import_store);
		}
		mav = selectAll(mav);
		return mav;
	}
	
	@RequestMapping("/doExportStore")
	public ModelAndView doExportStore(ModelAndView mav, ExportStore exportStore) throws Exception{
		if(storeService.exportStore(exportStore)){
			mav.addObject("SUCCESS", "出库成功！");
		}else{
			mav.addObject("ERROR", "此药品不存在或库存量不足！");
		}
		mav = selectAll(mav);
		return mav;
	}
	
	@RequestMapping("/doDeleteStore")
	public ModelAndView doDeleteStore(ModelAndView mav, Integer storeId)throws Exception{
		storeService.deleteStoreById(storeId);
		mav.addObject("SUCCESS", "删除成功！");
		mav = selectAll(mav);
		return mav;
	}
	
	@RequestMapping(value={"/returnIndex", "/returnBack"})
	public ModelAndView returnIndex(ModelAndView mav, HttpServletRequest req) throws Exception{
		String action = req.getRequestURI();
		if("/store/returnIndex".equals(action)){
			mav.setViewName("main");
		}else if("/store/returnBack".equals(action)){
			mav = selectAll(mav);
		}
		
		return mav;
	}
}
