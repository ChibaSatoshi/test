package com.internousdev.chiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.chiba.dto.UserListDTO;
import com.internousdev.chiba.util.DBConnector;

public class UserListDAO{
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<UserListDTO>getUserListInfo()throws SQLException{
		ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
		String sql = "SELECT id, login_id, login_pass, user_name, insert_date FROM login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserListDTO dto = new UserListDTO();
				dto.setNumber(rs.getString("id"));
				dto.setLoginUserId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsert_date(rs.getString("insert_date"));
				userList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userList;
	}

}