package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guoyasoft.bean.api.test.addStudent.request.Student;
import com.guoyasoft.tool.JdbcMysqlTools;

@Controller
@RequestMapping(value="student")
public class StudentController {
	
	@RequestMapping(value="add",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addStudent(Student stu){
		System.out.println(stu.toString());
		
		String sql="insert into "+stu.getTableName()+" (`sname`, `sno`, `age`, `phone`, `tname`, `eduction`, `sex`)"
				+ " values('"+stu.getSname()+"','"+stu.getSno()+"',"+stu.getAge()+",'"+stu.getPhone()+"','"+stu.getTname()+"','"+stu.getEducation()+"','"+stu.getSex()+"')";
		
		int result=JdbcMysqlTools.update(sql);
		if(result>0){
			return "新增成功";
		}else{
			return "新增失败";
		}
	}
}
