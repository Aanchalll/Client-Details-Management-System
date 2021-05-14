package com.demo.service;

import java.util.List;

import com.demo.to.UserTo;

public interface UserService {
public int verifyuser(String un, String pw);
public int registeruser(UserTo to);
public int getNextUserId();
public int getNextClientId();
public List<UserTo> getclientdetails();
public int newclient(UserTo to);
}
