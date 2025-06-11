package com.technorbit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateStudentInfo extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String stud_name=req.getParameter("std_name");
		String stud_email=req.getParameter("std_email");
		String stud_mob=req.getParameter("std_mobile");
		
		java.util.ArrayList<String> al=new java.util.ArrayList<String>();
		
		if(stud_name==null || stud_name==" " || stud_name.length()==0)
		{
			al.add("Students name is invalid");
		}
		
		if(stud_email==null||stud_email==" "||stud_email.length()==0)
		{
			al.add("Students email is invalid");
		}
		else
		{
			if(!stud_email.contains("@gmail.com"))
			{
				al.add("Students email is invalid:must contails @gmial.com");
			}
		}
		
		if(stud_mob==" " ||stud_mob==null)
		{
			al.add("Students mobile address is invalid");
		}
		else
		{
			if(stud_mob.length()!=10)
			{
				al.add("Invalid Mobile Number:Number must contains 10 digits");
			}
		}
		
		
		if(al.size()!=0)
		{
			for(String error:al)
			{
				pw.println(error+"<br>");
			}
		}
		else
		{	
			pw.println("Register Successfully");
		}
	}

}
