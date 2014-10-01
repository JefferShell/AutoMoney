package com.chanjet.datas;

import java.io.IOException;

import com.chanjet.exception.ReadDatasException;
import com.chanjet.tools.Config;

public class UserInfo {
	private String dataPath = "userInfo.txt";
	private Config config = null;
	public UserInfo() throws ReadDatasException{
		try {
			config = new Config(dataPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadDatasException("¶ÁÈ¡UserInfo´íÎó¯¯");
		}
	}
	public UserInfo(String path) throws ReadDatasException{
		try {
			config = new Config(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadDatasException("¶ÁÈ¡UserInfo´íÎó¯¯");
		}
	}
	public String getUserName(){
		return config.getString("userName");
	}
	public String getPwd(){
		return config.getString("pwd");
	}

}
