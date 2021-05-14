package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	public static Connection getmyConnection() throws SQLException{
		String url= "jdbc:mysql://localhost:3307/clientdetailsproject";
		Connection con=DriverManager.getConnection(url,"root", "0000");
	return con;
	}
	public static void cleanup(Statement st,Connection con) {
		try {
			st.close();
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void cleanup(ResultSet rs,Statement st,Connection con) {
		try {
			st.close();
			con.close();
			rs.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
