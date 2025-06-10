package com.technorbit.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CountryServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int index=Integer.parseInt(req.getParameter("country"));
		
		String[] country=new String[]{"India","Pakistan","Shrilanka","England"};
		String[] capital=new String[]{"New Delhi","Islamabad","Colombo","London"};
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<h2>Capital of "+country[index]+" is :"+capital[index]+"</h2><br>");
		pw.println("<a href=http://localhost:8081/Server_Communication_Using_JavaScript_>Home</a>");
		
	}
}
