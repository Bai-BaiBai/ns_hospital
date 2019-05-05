package com.dr.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dr.mapper.DrugMapper;
import com.dr.pojo.Drug;
import com.dr.service.DrugService;

@Service
@Transactional
public class DrugServiceImpl implements DrugService {

	@Resource
	DrugMapper drugMapper;
	
	@Override
	public ArrayList<Drug> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return drugMapper.selectAll();
	}

}
