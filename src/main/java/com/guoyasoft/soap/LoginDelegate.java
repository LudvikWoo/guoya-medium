package com.guoyasoft.soap;

import com.guoyasoft.bean.api.response.Response;

@javax.jws.WebService(targetNamespace = "http://soap.guoyasoft.com/", serviceName = "LoginService", portName = "LoginPort")
public class LoginDelegate {

	com.guoyasoft.soap.Login login = new com.guoyasoft.soap.Login();

	public Response checkUser(String userName) {
		return login.checkUser(userName);
	}

}