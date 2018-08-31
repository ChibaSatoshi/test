package com.internousdev.chiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.chiba.dto.LoginDTO;
import com.internousdev.chiba.util.DBConnector;

public class UserListInfoDAO{
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public ArrayList<LoginDTO> getUserInfo(String loginUserId ,String loginPassword){
		ArrayList<LoginDTO> loginDTO = new ArrayList<LoginDTO>();
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				LoginDTO dto = new LoginDTO();
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public int UserInfoDelete(String loginUserId)throws SQLException{

		String sql = "DELETE FROM login_user_transaction WHERE login_id = ?";
		PreparedStatement ps;
		int result = 0;

		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

}
