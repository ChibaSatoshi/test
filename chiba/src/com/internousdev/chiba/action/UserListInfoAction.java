package com.internousdev.chiba.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.chiba.dao.UserListInfoDAO;
import com.internousdev.chiba.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListInfoAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String message;
	public Map<String ,Object>session;
	private UserListInfoDAO userListInfoDAO = new UserListInfoDAO();
	private ArrayList<LoginDTO> loginList = new ArrayList<LoginDTO>();

	public String execute()throws SQLException{

		loginList = userListInfoDAO.getUserInfo(loginUserId, loginPassword);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
