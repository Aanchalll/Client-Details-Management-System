package com.demo.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.to.UserTo;
import com.demo.utility.JdbcUtil;

public class UserDaoImpl implements UserDao{
	
	@Override
	public int verifyuser(String un, String pw) {
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JdbcUtil.getmyConnection();
			String sql="Select * from user where email=? and password=?";
			ps =con.prepareStatement(sql);
			ps.setString(1, un);
			ps.setString(2, pw);
			rs=ps.executeQuery(); 
			if(rs.next())
			{
				x=1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanup(rs, ps, con);
		}
		return x;
	}

	@Override
	public int registeruser(UserTo to) {
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JdbcUtil.getmyConnection();
			String sql="Insert into user values (?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1,to.getUserid());
			ps.setString(2, to.getName());
			ps.setString(3,to.getEmail());
			ps.setString(4,to.getPassword());
			x=ps.executeUpdate();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanup(ps, con); 
		}
		return x;

	}

	@Override
	public int getNextUserId() {
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JdbcUtil.getmyConnection();
			String sql="Select max(userid) from user";
			ps= con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next())
			{
				x=rs.getInt(1);
				x=x+1;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanup(rs, ps, con);
		}
		return x;
	}

	@Override
	public int getNextClientId() {
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JdbcUtil.getmyConnection();
			String sql="Select max(clientid) from clientdetails";
			ps= con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next())
			{
				x=rs.getInt(1);
				x=x+1;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanup(rs, ps, con);
		}
		return x;
	}

	@Override
	public List<UserTo> getclientdetails() {
		List<UserTo> list= new ArrayList<UserTo>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JdbcUtil.getmyConnection();
			String sql= "Select * from clientdetails ORDER BY orgname";
			ps= con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())	
			{	int id=rs.getInt(1);
				String oname=rs.getString(2);
				String cname= rs.getString(3);
				Long num=rs.getLong(4);
				String add=rs.getString(5);
				String btype=rs.getString(6);
				String rservice=rs.getString(7);
				UserTo to=new UserTo(id,oname,cname,num,add,btype,rservice);
			list.add(to);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanup(rs, ps, con);
		}
		return list;
	}

	@Override
	public int newclient(UserTo to) {
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=JdbcUtil.getmyConnection();
			String sql="Insert into clientdetails values (?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1,to.getClientid());
			ps.setString(2, to.getOrgname());
			ps.setString(3,to.getContactname());
			ps.setLong(4, to.getPhone());
			ps.setString(5,to.getAddress());
			ps.setString(6, to.getBuisnesstype());
			ps.setString(7, to.getReqdservice());
			x=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanup(ps, con); 
		}
		return x;
		
	}

}
