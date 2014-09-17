package com.chanjet.testcase;

import org.testng.annotations.Test;

import com.chanjet.datas.Datas;
import com.chanjet.page.LoginPage;

public class LoginCase {
	private LoginPage loginPage = null;
	private Datas datas = null;
	@Test
	public void testcase_login() throws Exception{
		datas = new Datas();
		loginPage = new LoginPage();
		loginPage.inputUserName(datas.getUserName());
		loginPage.inputPwd(datas.getPwd());
		loginPage.clickConfirmBtn();
		loginPage.quit();
		System.out.println("case  done");
	}
	
	
	public static void main(String args[]){
		try {
			new LoginCase().testcase_login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
