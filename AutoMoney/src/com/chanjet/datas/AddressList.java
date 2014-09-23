package com.chanjet.datas;

import java.io.IOException;

import com.chanjet.exception.ReadAdressException;
import com.chanjet.tools.Config;

public class AddressList {
	private String dataPath = "address.txt";
	private Config config = null;
	public AddressList() throws ReadAdressException{
		try {
			config = new Config(dataPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadAdressException("��ȡ��ַ�ļ�����");
		}
	}
	public AddressList(String Path) throws ReadAdressException{
		try {
			config = new Config(Path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ReadAdressException("��ȡ��ַ�ļ�����");
		}
	}
	public String getAdressByName(String addressName){
		return config.getString(addressName);
	}
	public static void main(String[] args) {
		try {
			System.out.println(new AddressList().getAdressByName("beijing"));
		} catch (ReadAdressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
