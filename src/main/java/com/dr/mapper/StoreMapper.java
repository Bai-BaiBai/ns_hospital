package com.dr.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.dr.pojo.Drug;
import com.dr.pojo.ExportStore;
import com.dr.pojo.Import_store;
import com.dr.pojo.Store;

@Mapper
public interface StoreMapper {

	/**
	 * 查询全部库存信息
	 * @return
	 * @throws Exception
	 */
	ArrayList<Store> selectAll() throws Exception;
	
	/**
	 * 通过药品名查询库存信息
	 * @param drug_name
	 * @return
	 * @throws Exception
	 */
	ArrayList<Store> selectByName(String drug_name) throws Exception;
	
	/**
	 * 查询库存中是否有某药品
	 * @param id
	 * @return store
	 * @throws Exception
	 */
	Store findByDrugId(Integer id)throws Exception;
	
	/**
	 * 入库操作
	 * @param import_store
	 * @return
	 * @throws Exception
	 */
	int importStore(Import_store import_store)throws Exception;
	
	/**
	 * 增加新的库存信息
	 * @param import_store
	 * @return
	 * @throws Exception
	 */
	int insertStore(Import_store import_store)throws Exception;
	
	/**
	 * 出库操作
	 * @param exportStore
	 * @return
	 * @throws Exception
	 */
	int exportStore(ExportStore exportStore)throws Exception;
	
	/**
	 * 通过库存条目号删除库存信息
	 * @param storeId
	 * @return
	 * @throws Exception
	 */
	int deleteStoreById(Integer storeId)throws Exception;
}
