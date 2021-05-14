package com.demo.service;

import java.util.List;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.to.UserTo;

public class UserServiceImpl implements UserService {

	@Override
	public int verifyuser(String un, String pw) {
		UserDao dao=new UserDaoImpl();
		return dao.verifyuser(un, pw);
	}

	@Override
	public int registeruser(UserTo to) {
		UserDao dao=new UserDaoImpl();
	return dao.registeruser(to);
	}

	@Override
	public List<UserTo> getclientdetails() {
		UserDao dao=new UserDaoImpl();
		return dao.getclientdetails();
	}

	@Override
	public int newclient(UserTo to) {
		UserDao dao=new UserDaoImpl();
		return dao.newclient(to);
	}

	@Override
	public int getNextUserId() {
		UserDao dao=new UserDaoImpl();
		return dao.getNextUserId();
	}

	@Override
	public int getNextClientId() {
		UserDao dao=new UserDaoImpl();
		return dao.getNextClientId();
	}

}
