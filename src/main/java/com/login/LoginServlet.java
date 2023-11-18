package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("password");
		
		if(uname.equals("pavan") && (pass.equals("pavan"))) 
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("invalid inputs");
			response.sendRedirect("login.jsp");
		}
			
	}

}
