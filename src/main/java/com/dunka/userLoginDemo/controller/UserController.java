package com.dunka.userLoginDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dunka.userLoginDemo.bean.User;

@RestController
public class UserController {

	@RequestMapping("/index.do")
	public ModelAndView login() {
		return new ModelAndView("index.html");
	}
	
	@RequestMapping("/user/register.do")
	public ModelAndView register(User user) {
		System.out.println("register已经成功");
		return new ModelAndView("redirect:/index.do");
	}
}
