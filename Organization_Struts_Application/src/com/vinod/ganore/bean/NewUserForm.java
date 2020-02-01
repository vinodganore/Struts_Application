package com.vinod.ganore.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.struts.action.ActionForm;

import com.vinod.ganore.dao.ConnectionFactory;

public class NewUserForm extends ActionForm
{
	private String name;
	private String fisrt_name;
	private String middle_name;
	private String last_name;
	private String fname;
	private String dob;
	private String education;
	private String doj;
	private String email;
	private String technology;
	private String empid;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFisrt_name() {
		return fisrt_name;
	}
	public void setFisrt_name(String fisrt_name) {
		this.fisrt_name = fisrt_name;
	}
}
