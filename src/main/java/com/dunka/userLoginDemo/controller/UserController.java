package com.dunka.userLoginDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dunka.userLoginDemo.bean.User;
import com.dunka.userLoginDemo.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/index.do")
	public ModelAndView login() {
		return new ModelAndView("index.html");
	}
	
	@RequestMapping("/user/register.do")
	public ModelAndView register(User user) {
		
		System.out.println(user.getUsername() + "   "+user.getPassword()+ "  "+user.getTelephone());
		userRepository.save(user);
		return new ModelAndView("redirect:/index.do");
	}
	
	@RequestMapping("/user/login.do")
	public ModelAndView login(User user) {
		System.out.println(user.getUsername() + "  "+user.getPassword());
		User userLogin = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		if(userLogin == null) {
			return new ModelAndView("redirect:/index.do");
		}else {
			return new ModelAndView("/welcome.html");
		}
		
	}
	
}
