package com.dr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dr.pojo.User;
import com.dr.service.LoginService;
//import com.dr.service.LoginService;
import com.dr.service.impl.LoginServiceImpl;

@Controller
//@RestController
public class LoginController {
//	@Autowired
	@Resource
	LoginService loginService;
	
//	@Resource
//	LoginServiceImpl loginService;

	@RequestMapping("/login")
	public ModelAndView loginPage() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping("/logout")
	public String loginPage(HttpSession session) throws Exception {
		session.invalidate();
		return "login";
	}

	@RequestMapping("/index")
	public String indexPage() throws Exception {
		return "main";
	}

	@RequestMapping("/loginSubmit")
	public ModelAndView loginSubmit(HttpSession session, User user) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		if (user.getAccount() != null) {
			User loginUser = loginService.findUser(user);

			if (loginUser == null) {
				modelAndView.addObject("loginErrorMsg", "用户名或密码错误，请重新输入！");
				modelAndView.setViewName("login");
			} else {
				session.setAttribute("loginUser", loginUser);
				modelAndView.setViewName("main");
			}
		}else {
			modelAndView.setViewName("login");
		}
//		modelAndView.setViewName("main");
		return modelAndView;
	}
	
}
