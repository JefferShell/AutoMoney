package com.chanjet.page;

import com.chanjet.utils.Handler;

public class LoginPage extends BaseCase{

	public final static String userName = "//div[@class='shake-area']/div[2]/input";
	public final static String passWord = "//div[@class='shake-area']/div[3]/input";
	public final static String loginConfirm = "//*[@id='miniLogin']/input";
	
	
	public LoginPage() throws Exception {
		super();
		driver.get(config.getString(this.address.getAdressByName("beijing")));
	}
	public LoginPage(String name,String pwd) throws Exception {
		super();
		driver.get(config.getString("WebURL"));
		this.inputUserName(name);
		this.inputUserName(name);
		this.clickConfirmBtn();
	}

	public  void inputUserName(String name) throws Exception{
		handler.inputText(userName, name);
	}
	public  void inputPwd(String pwd) throws Exception{
		handler.inputText(passWord, pwd);
	}
	public  void clickConfirmBtn() throws Exception{
		handler.clickXpath(loginConfirm);
	}
	public void quit(){
		driver.quit();
	}

}
