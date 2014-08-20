package com.durian.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.durian.service.IBillService;
import com.durian.service.IUserService;
import com.durian.utils.Page;

@Controller
public class UesrController {

	@Autowired
	private IUserService userService;
	@Autowired
	private IBillService billService;
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request,
			@RequestParam(value = "userId", required = true) String userId,
			@RequestParam(value = "password", required = true) String password) {
		boolean loginSuccess = userService.login(userId, password);
		ModelAndView mav = new ModelAndView();
		if (!loginSuccess) {
			mav.setViewName("login");
		} else {
			request.getSession().setAttribute("loginUser", userService.getUser(userId));
			Page page = new Page(1);
			billService.getBillListByUserId(userId, page);
			mav.addObject(page);
			mav.setViewName("bill");
		}
		return mav;
	}
}