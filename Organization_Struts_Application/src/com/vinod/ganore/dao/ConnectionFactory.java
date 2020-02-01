package com.vinod.ganore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory
{
	static ConnectionFactory confactory=null;
	public Connection con = null;
	private ConnectionFactory()
	{
		
	}
	public static ConnectionFactory getInstance()
	{
		if(confactory==null)
			confactory=new ConnectionFactory();
		return confactory;
	}
	public  Connection getConnection()
	{
		try
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl="jdbc:oracle:thin:@localhost:1521:orcl";
			String uname="scott";
			String pwd="tiger";
			con=DriverManager.getConnection(dburl,uname,pwd); 
			
		}
		catch(ClassNotFoundException se)
		{
			se.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
