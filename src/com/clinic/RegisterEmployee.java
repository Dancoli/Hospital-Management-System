package com.clinic;

import com.myclasses.DatabaseOperationsInterface;
import com.myclasses.Employee;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterEmployee extends HttpServlet{
	@Inject
	@Named(value = "MYSQL")
	DatabaseOperationsInterface v;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Employee employee=new Employee();
		v.connect();
		PrintWriter out=response.getWriter();
		employee.setRole(request.getParameter("role"));
		employee.setIdNo(Integer.parseInt(request.getParameter("idno")));
		employee.setName(request.getParameter("name"));
		employee.setAge(Integer.parseInt(request.getParameter("age")));
		employee.setDob(request.getParameter("dob"));
		employee.setPhone(request.getParameter("phone"));
		employee.setEmail(request.getParameter("email"));
		employee.setGender(request.getParameter("gender"));
		employee.setUsername(request.getParameter("username"));
		employee.setPassword(request.getParameter("password"));
		String registerEmployee="INSERT INTO person(idNo,name,age,dob,phone,email,gender,role,pass,username)VALUES('"+employee.getIdNo()+"','"+employee.getName()+"','"+employee.getAge()+"','"+employee.getDob()+"','"+employee.getPhone()+"','"+employee.getEmail()+"','"+employee.getGender()+"','"+employee.getRole()+"','"+employee.getPassword()+"','"+employee.getUsername()+"')";
		if(v.write(registerEmployee))
		{
			out.println("Employee Successfully created");
		}
		else
		{
			out.println("invalid credentials");
		}

	}
}
