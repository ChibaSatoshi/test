package com.internousdev.chiba.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{
	public Map<String ,Object> session;
	private String itemCreate_name;
	private String itemCreate_price;
	private String itemCreate_stock;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(!(itemCreate_name.equals(""))
				&&!(itemCreate_price.equals(""))
				&&!(itemCreate_stock.equals(""))){
			session.put("itemCreate_name", itemCreate_name);
			session.put("itemCreate_price", itemCreate_price);
			session.put("itemCreate_stock", itemCreate_stock);

		}else{
			setErrorMessage("未記入の項目がありますよ。");
			result = ERROR;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}