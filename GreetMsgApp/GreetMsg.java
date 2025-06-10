package com.tcs.technorbit;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetMsg extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		LocalDateTime ldt = LocalDateTime.now();
		
		int hour=ldt.getHour();
		int minute=ldt.getMinute();
		int sec=ldt.getSecond();
		
		if(hour<12)
		{
			pw.println("<h1>Good Morning</h1>:"+hour+":"+minute);
		}
		else if(hour>12&&hour<16)
		{
			pw.println("<h1>Good Afternoon</h1>");
		}
		else if(hour>16&&hour<20)
		{
			pw.println("<h1>Good Evening</h1>");
			pw.println(""+hour+":"+minute+":"+sec);
		}
		else
		{
			pw.println("<h1>Good Night</h1>");
		}
		res.setHeader("refresh","10"); //auto refresh
		res.setIntHeader("refresh", 1);
		
	}

}
