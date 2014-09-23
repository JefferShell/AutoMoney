package com.chanjet.datas;

import java.io.IOException;

import com.chanjet.exception.ReadAdressException;
import com.chanjet.exception.ReadDatasException;
import com.chanjet.utils.Config;

public class AdressList {
	private String dataPath = "address.txt";
	private Config config = null;
	public AdressList() throws ReadAdressException{
		try {
			config = new Config(dataPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadAdressException("读取地址错误");
		}
	}
	public String getAdressByName(String addressName){
		return config.getString(addressName);
	}
	public static void main(String[] args) {
		try {
			System.out.println(new AdressList().getAdressByName("beijing"));
		} catch (ReadAdressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
