package com.chanjet.test;

import com.chanjet.utils.Config;


public class AutoDemo {
	private Config config = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		AutoDemo auto = new AutoDemo();
		auto.init();
		System.out.println(auto.getString("WebURL"));
		System.out.println(auto.getString("Explorer"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	private void init() throws Exception{
		// TODO Auto-generated method stub
		String configName = "AutotestConfig.properties";
		config = new Config(configName);
	}
	public String getString(String key){
		return config.getString(key);
	}

}
