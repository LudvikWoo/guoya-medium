package com.guoyasoft.soap;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.response.Response;
import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.GyUserExample;
import com.guoyasoft.bean.db.GyUserExample.Criteria;
import com.guoyasoft.dao.GyUserMapper;

public class Login {


	@Autowired
	GyUserMapper mapper;
	
	public Response checkUser(String userName) {
		System.out.println("userName=" + userName );

		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();

		c.andSnameEqualTo(userName);
		List<GyUser> users =new ArrayList<GyUser>();

		Response response=new Response();
		try{
			users = mapper.selectByExample(example);
		}catch(Exception e){
			e.printStackTrace();
			response.setRespCode("0001");
			response.setRespDesc("用户已存在");
			return response;
		}
		if(users.size()==0){
			response.setRespCode("0000");
			response.setRespDesc("成功");
		}else{
			response.setRespCode("0001");
			response.setRespDesc("用户已存在");
		}
		return response;
	}
}
