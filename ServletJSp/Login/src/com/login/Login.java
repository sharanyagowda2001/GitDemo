package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		
	  
		res.setContentType("text/html");  
		
		PrintWriter out = res.getWriter();  
		
		String n=req.getParameter("username");  
		String p=req.getParameter("password");  
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oracle10g","root","root");
		  
			PreparedStatement ps=con.prepareStatement( "select * from signup where username=(?) and password=(?)");  
		  
			ps.setString(1,n);  
			ps.setString(2,p);  
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				out.println("Logged in succesfully!");
			}
			else {
				out.println("Invalid user!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		out.close();
		
	}
	
}
