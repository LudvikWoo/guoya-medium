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

@javax.jws.WebService(targetNamespace = "http://soap.guoyasoft.com/", serviceName = "LoginService", portName = "LoginPort")
public class LoginDelegate {

	com.guoyasoft.soap.Login login = new com.guoyasoft.soap.Login();

	public Response checkUser(String userName) {
		return login.checkUser(userName);
	}

}