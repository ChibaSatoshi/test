package com.internousdev.chiba.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.chiba.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{
	private String itemCreate_name;
	private String itemCreate_price;
	private String itemCreate_stock;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();
	public Map<String ,Object> session;

	public String execute() throws SQLException{

		itemCreateCompleteDAO.createItem(session.get("itemCreate_name").toString(),
				session.get("itemCreate_price").toString(),
				session.get("itemCreate_stock").toString());
		String result = SUCCESS;

		return result;
	}
	public String getItemCreate_name() {
		return itemCreate_name;
	}
	public void setItemCreate_name(String itemCreate_name) {
		this.itemCreate_name = itemCreate_name;
	}
	public String getItemCreate_price() {
		return itemCreate_price;
	}
	public void setItemCreate_price(String itemCreate_price) {
		this.itemCreate_price = itemCreate_price;
	}
	public String getItemCreate_stock() {
		return itemCreate_stock;
	}
	public void setItemCreate_stock(String itemCreate_stock) {
		this.itemCreate_stock = itemCreate_stock;
	}
	public ItemCreateCompleteDAO getItemCreateCompleteDAO() {
		return itemCreateCompleteDAO;
	}
	public void setItemCreateCompleteDAO(ItemCreateCompleteDAO itemCreateCompleteDAO) {
		this.itemCreateCompleteDAO = itemCreateCompleteDAO;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
