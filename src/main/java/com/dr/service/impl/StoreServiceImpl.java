package com.dr.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dr.mapper.StoreMapper;
import com.dr.pojo.ExportStore;
import com.dr.pojo.Import_store;
import com.dr.pojo.Store;
import com.dr.service.StoreService;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {

	@Resource
	private StoreMapper storeMapper;
	
	@Override
	public ArrayList<Store> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return storeMapper.selectAll();
	}

	@Override
	public ArrayList<Store> selectByName(String drug_name) throws Exception {
		// TODO Auto-generated method stub
		return storeMapper.selectByName(drug_name);
	}

	@Override
	public boolean findByDrugId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Store store = storeMapper.findByDrugId(id);
		if(store == null){
			return false;
		}else{
			return true;
		}
		
	}

	@Override
	public int importStore(Import_store import_store) throws Exception {
		// TODO Auto-generated method stub
		return storeMapper.importStore(import_store);
	}

	@Override
	public int insertStore(Import_store import_store) throws Exception {
		// TODO Auto-generated method stub
		return storeMapper.insertStore(import_store);
	}

	@Override
	public boolean exportStore(ExportStore exportStore) throws Exception {
		// TODO Auto-generated method stub
		Store store = storeMapper.findByDrugId(exportStore.getDrugId());
		if(store == null){//判断库存中有没有此药品
			return false;
		}else{
			double num = store.getRemain_num();
			if(num >= exportStore.getExportNum()){//判断药品库存数量是否大于出库数量
				storeMapper.exportStore(exportStore);
				return true;
			}else{
				return false;
			}
		}
	}

	@Override
	public int deleteStoreById(Integer storeId) throws Exception {
		// TODO Auto-generated method stub
		return storeMapper.deleteStoreById(storeId);
	}

}
