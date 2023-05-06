package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculateurl")
public class Calculator extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		

		String str = req.getParameter("calculate");
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		
			if(str.equalsIgnoreCase("add")) 
				 pw.println("<h1 style='color:red;text-align:center'>"+(a+b)+"</h1>");
			else if(str.equalsIgnoreCase("sub"))
				pw.println("<h1 style='color:red;text-align:center'>"+(a-b)+"</h1>");
			else if(str.equalsIgnoreCase("mul"))
				pw.println("<h1 style='color:red;text-align:center'>"+(a*b)+"</h1>");
			else if(str.equalsIgnoreCase("div"))
				pw.println("<h1 style='color:red;text-align:center'>"+(a/b)+"</h1>");
}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
