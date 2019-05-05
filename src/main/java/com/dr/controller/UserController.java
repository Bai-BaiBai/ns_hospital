package com.dr.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dr.pojo.Dept;
import com.dr.pojo.User;
import com.dr.service.DeptService;
import com.dr.service.UserService;

@Controller
public class UserController {
	
	@Resource
	UserService userService;

	@Resource
	DeptService deptService;
	
	@RequestMapping("/getUserList")
	public ModelAndView getUserList() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<User> userList = userService.getUserList();
		
		modelAndView.addObject(userList);
		modelAndView.setViewName("../userManage/userList");
		return modelAndView;
	}
	
	@RequestMapping("/selectByName")
	public ModelAndView selectByName(String username,ModelAndView modelAndView) throws Exception{
		User userList = userService.selectByName(username);
		
		modelAndView.addObject(userList);
		modelAndView.setViewName("../userManage/userList");
		return modelAndView;
	}
	
	@RequestMapping(value={"/userAdd","/userModify"})
	public ModelAndView userManage(ModelAndView modelAndView, HttpServletRequest req, Integer id) throws Exception{
		String action = req.getRequestURI();
		/*
		 * 
		 Spring Security会将登录的用户信息存储在session的SPRING_SECURITY_CONTEXT属性
		SecurityContextImpl securityContextImpl = (SecurityContextImpl) req.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
		System.out.println(securityContextImpl.getAuthentication().getName());
		*/
		if("/userAdd".equals(action)){
//			ArrayList<Dept> dept = deptService.getDeptList();
//			modelAndView.addObject("dept", dept);
			modelAndView.setViewName("../userManage/userAdd");
		}else if("/userModify".equals(action)){
//			ArrayList<Dept> dept = deptService.getDeptList();
//			modelAndView.addObject("dept", dept);
			User user = userService.findUserById(id);
			modelAndView.addObject("user", user);
			modelAndView.setViewName("../userManage/userModify");
		}
		
		return modelAndView;
	}
	
	@RequestMapping("/doUserAdd")
	public ModelAndView doUserAdd(User user, ModelAndView modelAndView) throws Exception{
		
		if(!userService.findUserByAccount(user.getAccount())){//返回true表明存在该用户
			userService.doUserAdd(user);
			modelAndView = getUserList();
		}else{
			modelAndView.addObject("ERROR", "账户已存在");
//			ArrayList<Dept> dept = deptService.getDeptList();
//			modelAndView.addObject("dept", dept);
			modelAndView.setViewName("../userManage/userAdd");
		}
		
		return modelAndView;
	}
	
	
}
