package com.technorbit.servlet.arithmeti_operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Arithmetic_Operstions extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		
		int n1=Integer.parseInt(req.getParameter("num1"));
		
		int n2=Integer.parseInt(req.getParameter("num2"));
		
		String op=req.getParameter("operation");
		
		if(op.equalsIgnoreCase("add"))
		{
			pw.println("<h1>Addition of "+n1+" and "+n2+" is "+(n1+n2)+"<h1>");
		}
		else if(op.equalsIgnoreCase("sub"))
		{
			pw.println("<h1>Substraction of "+n1+" and "+n2+" is "+(n1-n2)+"<h1>");
		}
		else if(op.equalsIgnoreCase("mul"))
		{
			pw.println("<h1>Multiplication of "+n1+" and "+n2+" is "+(n1*n2)+"<h1>");
		}
		else
		{
			pw.println("<h1>Division of "+n1+" and "+n2+" is "+(n1/n2)+"<h1>");
		}
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doPost(req,res);
	}

}
