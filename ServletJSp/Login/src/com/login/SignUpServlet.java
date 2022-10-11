package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws IOException {  
  
	response.setContentType("text/html");  
	
	PrintWriter out = response.getWriter();  
	
	String n=request.getParameter("username");  
	String p=request.getParameter("password");  
	
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oracle10g","root","root");
	  
		PreparedStatement ps=con.prepareStatement( "insert into signup values(?,?)");  
	  
		ps.setString(1,n);  
		ps.setString(2,p);  
	
	          
		int i=ps.executeUpdate();  
		if(i>0)  {
//			out.print("You are successfully registered...");  
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");      
			rd.forward(request, response);
		}
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  
}
