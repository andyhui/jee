package com.org.action;

import com.opensymphony.xwork2.Action;
//import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	private String password;
	public String execute() throws Exception{
		if(getUsername().equals("admin") && getPassword().equals("admin")){
			ActionContext.getContext().getSession().put("user",username);
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	/*public void validate(){
		if(getUsername()==null||getUsername().trim().equals("")){
			addFieldError("username","user.required");
		}
		
		if(getPassword()==null||getPassword().trim().equals("")){
			addFieldError("password","password.required");
		}
	}*/

}
