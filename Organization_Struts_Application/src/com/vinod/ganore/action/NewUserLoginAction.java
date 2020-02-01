package com.tcs.ttsl.action;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;

import com.tcs.ttsl.bean.NewUserForm;
import com.tcs.ttsl.dao.ConnectionFactory;
import com.tcs.ttsl.dao.NewUserLoginDao;

public class NewUserLoginAction extends Action
{	int result=0;
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res) throws Exception
	{	
		NewUserForm nuf=(NewUserForm)form;
		ArrayList al=new ArrayList();
		System.out.println("in newuserloginaction"+nuf.getName());
		al.add(nuf.getFisrt_name());		
		al.add(nuf.getFname());
		al.add(nuf.getDob());
		al.add(nuf.getEducation());													//<NewUserForm>
		al.add(nuf.getDoj());
		al.add(nuf.getEmail());
		al.add(nuf.getTechnology());
		al.add(nuf.getMiddle_name());
		al.add(nuf.getLast_name());
		
		req.setAttribute("newuser", al);
		req.setAttribute("newusername", nuf.getFisrt_name());
		NewUserLoginDao nuld=new NewUserLoginDao();
		
		result=nuld.newuserInfo(al);
		
		
		String empid=nuld.employee_id(nuf);
		
		req.setAttribute("empid", empid);
		
	    form.reset(mapping, req);
		
		if(result==1)
			return mapping.findForward("inserted");
		else
			return mapping.findForward("notinserted");
		
		
		
		
	}
	public void reset(ActionMapping mapping, ServletRequest request)
	{
	    System.out.println("TEST1");
	    try
	    {
	        reset(mapping, (HttpServletRequest)request);
	    }
	    catch(ClassCastException e) { }
	}
	 
	public void reset(ActionMapping actionmapping, HttpServletRequest httpservletrequest)
	{
	    System.out.println("TEST2");
	} 
}
