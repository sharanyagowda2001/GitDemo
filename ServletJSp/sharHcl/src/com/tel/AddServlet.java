package com.tel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")

public class AddServlet extends HttpServlet{
	
	
	//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		int i=Integer.parseInt(req.getParameter("numb1"));
		int j=Integer.parseInt(req.getParameter("numb2"));
		
		int k=i+j;
	//	req.setAttribute("k",k);
		
		//res.sendRedirect("Sq?k="+k);//url rewriting
		
//		HttpSession session=req.getSession();
//		session.setAttribute("k",k);
		
//		Cookie cookie=new Cookie("k",k+"");
//		res.addCookie(cookie);
//		res.sendRedirect("Sq");
//		RequestDispatcher rd=req.getRequestDispatcher("Sq");
//		rd.forward(req,res);
	}
}