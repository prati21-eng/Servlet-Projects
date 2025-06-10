package com.technorbit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultipleLinksHandling extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		Locale obj[]=Locale.getAvailableLocales();
		
		String result=req.getParameter("key");
		
		if(result.equalsIgnoreCase("link1"))
		{
			for(Locale i:obj)
			{
				pw.println(i.getCountry());
			}
		}
		if(result.equalsIgnoreCase("link2"))
		{
			for(Locale i:obj)
			{
				pw.println(i.getLanguage());
			}
		}
		if(result.equalsIgnoreCase("link3"))
		{
			pw.println(java.time.LocalDateTime.now());
		}
	}

}
