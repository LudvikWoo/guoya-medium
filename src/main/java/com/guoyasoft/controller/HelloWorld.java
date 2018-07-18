package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="helloWorld")
public class HelloWorld {
	
	@RequestMapping("sayHello")
	@ResponseBody
	public String sayHello(String userName,String password,String checkcode){
		System.out.println(userName);
		String sql="select * from t_user_user t where t.user_name='"+userName+"'";
		String dbPassword="123456";
		if(dbPassword.equals(password)){
			return "success";
		}else{
			return "password is wrong ";
		}
	}
}
