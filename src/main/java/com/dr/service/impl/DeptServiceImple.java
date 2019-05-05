package com.dr.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dr.mapper.DeptMapper;
import com.dr.pojo.Dept;
import com.dr.service.DeptService;

@Service
@Transactional
public class DeptServiceImple implements DeptService {

	@Resource
	private DeptMapper deptMapper;
	
	@Override
	public ArrayList<Dept> getDeptList() throws Exception {
		// TODO Auto-generated method stub
		return deptMapper.getDeptList();
	}

}
