package com.dunka.userLoginDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

	@RequestMapping("/index.do")
	public ModelAndView login() {
		return new ModelAndView("index.html");
	}
}
