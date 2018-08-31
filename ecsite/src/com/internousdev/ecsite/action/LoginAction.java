package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private LoginDAO logindao = new LoginDAO();
	private LoginDTO logindto = new LoginDTO();
	private BuyItemDAO buyitemdao = new BuyItemDAO();
	public Map<String,Object> session;

	public String execute(){
		String result = ERROR;
		logindto = logindao.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",logindto);

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result= SUCCESS;
			BuyItemDTO buyitemdto = buyitemdao.getbuyItemInfo();

			session.put("login_user_id",logindto.getLoginId());
			session.put("id",buyitemdto.getId());
			session.put("buyItem_name",buyitemdto.getItemName());
			session.put("buyItem_price",buyitemdto.getItemPrice());

			return result;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}