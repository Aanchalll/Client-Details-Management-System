package com.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import com.demo.to.UserTo;

public class ClientList extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service=new UserServiceImpl(); 
		HttpSession sess=req.getSession();
	    String cd=req.getParameter("choice");
	    
	if((cd.toString()).equals("seeclient")) {		
		
		List<UserTo> list=service.getclientdetails();
		req.setAttribute("listUser",list); 
		RequestDispatcher rd=req.getRequestDispatcher("allclientdetails.jsp");
		rd.forward(req, resp);
	}
	else if((cd.toString()).equals("newclient")) {
		RequestDispatcher rd=req.getRequestDispatcher("newclient.jsp");
		rd.forward(req, resp);
	}
	}

}
