package com.tel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.print("hi");
		
		ServletConfig cg=getServletConfig();
		String str=cg.getInitParameter("name");
		out.println(str);
		
	}
}
