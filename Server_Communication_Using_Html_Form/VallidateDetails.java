package com.microsoft.matrimony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VallidateDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		int age=Integer.parseInt(req.getParameter("age"));
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		if(age>100&&age<1)
		{
			pw.println("<h1>Enter Valid age</h1>");
		}
		else
		{
			if(age<18)
			{
				pw.println("<h1>"+name+"   </h1>");
			}
			else if(age>50)
			{
				pw.println("<h1>"+name+" are mhatara zalas na lagna karayala</h1>");
			}
			else
			{
				pw.println("</h1> Congratulations "+name +" Your age is Perfect for marriage</h1>");
			}
		}
		
	}
}
