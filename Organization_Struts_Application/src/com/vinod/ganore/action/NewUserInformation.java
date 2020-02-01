package com.vinod.ganore.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.tiles.ActionController;

import com.vinod.ganore.bean.NewUserForm;
import com.vinod.ganore.bean.UserForm;
import com.vinod.ganore.dao.NewUserLoginDao;

import org.apache.struts.action.Action;


public class NewUserInformation extends Action
{
	private static final long serialVersionUID = 1L;


    public NewUserInformation() {
    	 
        super();
        System.out.println("NewUserInformation -- Constructor");
        // TODO Auto-generated constructor stub
    }



    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res) throws Exception
	{	
    	System.out.println("NewUserInformation---Execute menthod()");

		NewUserForm nuf=(NewUserForm)form;
		NewUserLoginDao nuld=new NewUserLoginDao();

		ServletContext context = req.getSession().getServletContext();
		
		String UNAME =(String) context.getAttribute("UNAME");
		//String username =(String) context.getParameter("username");
		String PWD= (String) context.getAttribute("PWD");

		ArrayList al=nuld.userInformation(UNAME);
	    req.setAttribute("userInfo",al);
	    System.out.println("user information is-------->>>"+al);
	    System.out.println("username "+UNAME);
		String result="success";
		req.setAttribute("USER_INFORMATION",al);
		return mapping.findForward(result);
		
	}


}
