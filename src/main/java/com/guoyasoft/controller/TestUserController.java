package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("testUser")
public class TestUserController {
	
	@RequestMapping("signUp.do")
	//@ResponseBody
	public String signUp(User user){
		System.out.println(user.toString());
		if("123456".equals(user.getPassword())){
			return "user/login";
		}else{
			return "user/signUp";
		}
	}
}
