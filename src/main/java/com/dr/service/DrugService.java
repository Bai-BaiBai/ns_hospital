package com.dr.service;

import java.util.ArrayList;

import com.dr.pojo.Drug;

public interface DrugService {

	ArrayList<Drug> selectAll() throws Exception;
}
