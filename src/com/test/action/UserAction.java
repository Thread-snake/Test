package com.test.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.entity.User;
import com.test.service.UserService;



public class UserAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2859503180927731566L;
	@Resource
	private UserService userServvice;
	
	public String query() {
		List<User> list =userServvice.find();
		
		ActionContext act = ActionContext.getContext();
		
		Map session = act.getSession();
		
		session.put("test", list);
		
		return "success";
	}

}
