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
import com.demo.to.UserTo;

public class Register extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service=new UserServiceImpl();
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		int uid=service.getNextUserId();
	UserTo to= new UserTo(uid, name, email, password);
	int x=service.registeruser(to);
	HttpSession sess=req.getSession();
	String page="";
	String msg="";
	if(x==1) {
		msg="Registraton Successful, Login to continue.";
		sess.setAttribute("MSG", msg);
		page="Welcome.jsp";
	}else {
		msg="Registraton failed.  Try again.";
				sess.setAttribute("MSG", msg);
				page="register.jsp";
	}
	RequestDispatcher rd=req.getRequestDispatcher(page);
	rd.forward(req, resp);
	}

}
