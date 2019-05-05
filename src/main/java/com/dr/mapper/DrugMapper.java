package com.dr.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.dr.pojo.Drug;

@Mapper
public interface DrugMapper {

	ArrayList<Drug> selectAll() throws Exception;
}
