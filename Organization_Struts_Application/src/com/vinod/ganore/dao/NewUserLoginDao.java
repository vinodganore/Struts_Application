package com.vinod.ganore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vinod.ganore.action.NewUserLoginAction;
import com.vinod.ganore.bean.NewUserForm;
import com.vinod.ganore.bean.UserForm;

public class NewUserLoginDao 
{
	String empid=null;
	public String employee_id(NewUserForm nuf) throws Exception
	{
		System.out.println("in employee_id()"+nuf.getName());
		//System.out.println("in employee_id()"+nuf.getName());
		ConnectionFactory cf=ConnectionFactory.getInstance();
		Connection con=cf.getConnection();
		PreparedStatement ps=con.prepareStatement("select empno from VVL_EMPLOYEE_DETAILS where Ename='"+nuf.getFisrt_name()+"'");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			 empid=rs.getString(1);
			 System.out.println("empid="+empid);
		}
		
		return empid;
	}
	
	public String logicCheck(UserForm uf) throws Exception
	{
		String uname=uf.getUsername();
		String pwd=uf.getPassword();
		String login_result=null;
		String encrypt_Pwd=null;
		ConnectionFactory cf=ConnectionFactory.getInstance();
		Connection con=cf.getConnection();
	/*	PreparedStatement ps0=con.prepareStatement("select GVK_ENCRYPTION("+"'"+pwd+"'"+") from dual" );
		ResultSet rs0=ps0.executeQuery();
		while(rs0.next())
		{
			encrypt_Pwd=rs0.getString(1);
			System.out.print("encrypt_Pwd-->>"+encrypt_Pwd);
		}
		System.out.print("uname-->>"+uname);*/
		PreparedStatement ps=con.prepareStatement("Select count(*) from VVL_USERLOGIN_DETAILS where username="+"'"+uname+"'"+" and password="+"'"+pwd+"' and rownum<2");//encrypt_Pwd
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			login_result=rs.getString(1);
		}
		System.out.print("login_result-->>"+login_result);
		return login_result;
	}
	public ArrayList userInformation(String UNAME) throws ClassNotFoundException ,SQLException
	{
		ArrayList al =new ArrayList();
		ResultSet rs;
		ConnectionFactory cf=ConnectionFactory.getInstance();
		Connection con=cf.getConnection();
		PreparedStatement ps=con.prepareStatement("select EMPNO,ENAME,FATHER_NAME,EDUCATION,EMAIL,Technology,DOJ from VVL_EMPLOYEE_DETAILS where upper(ENAME)='"+UNAME.toUpperCase()+"'" );
		//ps.setString(1, nuf.getName());
		System.out.println("select EMPNO,ENAME,FATHER_NAME,EDUCATION,EMAIL,Technology,DOJ from VVL_EMPLOYEE_DETAILS where upper(ENAME)='"+UNAME.toUpperCase()+"'" );
		try
		{	System.out.println("Dao --userInformation() Try block");
			 rs=ps.executeQuery();
				
		}		
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Dao --userInformation() Exception block");
			rs=null;
		}
		while(rs.next())
		{
			
		
			al.add(rs.getInt("EMPNO"));
			al.add(rs.getString("ENAME"));
			al.add(rs.getString("FATHER_NAME"));
			al.add(rs.getString("EDUCATION"));
			al.add(rs.getString("EMAIL"));
			al.add(rs.getString("TECHNOLOGY"));
			al.add(rs.getDate("DOJ"));
			
		}		
		System.out.println("New user Information is"+al);
		return al;		
	}
	public int newuserInfo( ArrayList al) throws Exception
	{	
		/*NewUserForm nuf=new NewUserForm();
		Object obj[]=UserDetails.toArray();
		for(int i=0;i<UserDetails.size();i++)
		{
			nuf=obj[i];
			
		}
		*/
		ConnectionFactory cf=ConnectionFactory.getInstance();
		Connection con=cf.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into VVL_EMPLOYEE_DETAILS("
				+ "empno,ename,father_name,"
				+ "dob,education,email,"
				+ "doj,Technology,first_name,"
				+ "middle_name,last_name)"
				+ " values(empid_seq.nextval,?,?,"
				+ "to_date(?,'DD-MON-YYYY'),?,?,"
				+ "to_date(?,'DD-MON-YYYY'),?,?,"
				+ "?,?)");
		//System.out.println(empid_seq.nextval);
		System.out.println("in Dao"+al);
		//ps.setInt(1,Integer.parseInt((String) al.get(1)));//
		System.out.println("ename is "+al.get(0));
		System.out.println("fname is "+al.get(1));
		System.out.println("DOB is "+al.get(2));
		System.out.println("edu is "+al.get(3));
		System.out.println("email is "+al.get(5));
		System.out.println("doj is "+al.get(4));
		System.out.println("Tech is "+al.get(6));
		try
		{
			ps.setString(1,(String)al.get(0));
			ps.setString(2,(String)al.get(1));
			ps.setString(3,(String)al.get(2));
			ps.setString(4,(String)al.get(3));
			ps.setString(5,(String)al.get(5));
			ps.setString(6,(String)al.get(4));
			ps.setString(7,(String)al.get(5));
			ps.setString(8,(String)al.get(0));
			ps.setString(9,(String)al.get(7));
			ps.setString(10,(String)al.get(8));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("Arraylist values are"+al);
		}
		int res=ps.executeUpdate();
		System.out.println("commit");
		
		return res;
	}
	
}
