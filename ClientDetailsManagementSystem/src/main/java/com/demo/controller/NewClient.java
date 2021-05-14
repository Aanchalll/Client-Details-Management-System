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

public class NewClient extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service=new UserServiceImpl();
		String orgname= req.getParameter("orgname");
		String contactname= req.getParameter("contactname");
		String phone= req.getParameter("phone");
		String address= req.getParameter("address");
		String buisnesstype= req.getParameter("buisnesstype");
		String reqdservice= req.getParameter("reqdservice");

		int clientid =service.getNextClientId();
		Long ph=Long.parseLong(phone);
		
	UserTo to= new UserTo(clientid, orgname, contactname, ph, address, buisnesstype,reqdservice);
	int x=service.newclient(to);
	HttpSession sess=req.getSession();
	String page="";
	String msg="";
	    if(x==1) {
	          	msg="Client Data Saved Successfully";
		        sess.setAttribute("MSG", msg);
		        page="mainmenu.jsp";
	    }else {
		        msg="Process failed.  Try again.";
				sess.setAttribute("MSG", msg);
				page="mainmenu.jsp";
	    }
	RequestDispatcher rd=req.getRequestDispatcher(page);
	rd.forward(req, resp);
	}

}
