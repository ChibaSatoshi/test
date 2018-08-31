package com.internousdev.chiba.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.chiba.dao.UserListDAO;
import com.internousdev.chiba.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	private UserListDAO userListDAO = new UserListDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private String deleteFlg;
	private String message;


	public String execute()throws SQLException{

		userList = userListDAO.getUserListInfo();
		return SUCCESS;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public UserListDAO getUserListDAO() {
		return userListDAO;
	}


	public void setUserListDAO(UserListDAO userListDAO) {
		this.userListDAO = userListDAO;
	}


	public ArrayList<UserListDTO> getUserList() {
		return userList;
	}


	public void setUserList(ArrayList<UserListDTO> userList) {
		this.userList = userList;
	}


	public String getDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
}