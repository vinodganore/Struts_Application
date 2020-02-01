package com.tcs.ttsl.action;
import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import com.tcs.ttsl.bean.*;
import com.tcs.ttsl.dao.NewUserLoginDao;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
public class UserAction extends Action
{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res) throws Exception
	{	
		UserForm uf=(UserForm)form;
		//NewUserForm nuf=(NewUserForm)form;
		NewUserLoginDao nuld=new NewUserLoginDao();
		String result;
		String user=uf.getUsername();
		String pass=uf.getPassword();
		
		req.setAttribute("UNAME",user);
		req.setAttribute("PWD",pass);
		String login_result=nuld.logicCheck(uf);
		//ArrayList al=nuld.userInformation(nuf);
	//	req.setAttribute("userInfo",al);
	//	System.out.println("user information is"+`al);
		if(login_result.equals("1"))
			result="success";
		else
			result="failure";
		
		/*if(user.equals("vinod") && pass.equals("ganore"))
			result="success";
		else
			result="failure";*/
		return mapping.findForward(result);
		
	}

	
}
