package com.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class Login extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service=new UserServiceImpl();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		int x=service.verifyuser(username, password);
		HttpSession sess=req.getSession();
		String page="";
		String msg="";
		if(x==1) {
			msg="Welcome!";
			sess.setAttribute("MSG", msg);
			page="mainmenu.jsp";
		}
		else {
			msg="Wrong Password or Email!  Try again.";
			sess.setAttribute("MSG", msg);
			page="Welcome.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(page);
		rd.forward(req, resp);
	}

}
