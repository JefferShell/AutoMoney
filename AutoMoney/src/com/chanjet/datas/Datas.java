package com.chanjet.datas;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.chanjet.exception.ReadDatasException;
import com.chanjet.utils.Config;

public class Datas {
	private String dataPath = "datas.txt";
	private Config config = null;
	public Datas() throws ReadDatasException{
		try {
			config = new Config(dataPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadDatasException("读取账号错误");
		}
	}
	public String getUserName(){
		return config.getString("userName");
	}
	public String getPwd(){
		return config.getString("pwd");
	}
	public static void main(String[] args) {
		try {
			System.out.println(new Datas().getUserName());
			System.out.println(new Datas().getPwd());
		} catch (ReadDatasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
