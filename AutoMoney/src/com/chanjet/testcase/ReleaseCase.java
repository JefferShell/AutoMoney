package com.chanjet.testcase;

import org.testng.annotations.Test;

import com.chanjet.datas.DatasItf;
import com.chanjet.datas.UserInfo;
import com.chanjet.page.LoginPage;
import com.chanjet.page.MainPage;
import com.chanjet.utils.BaseUtil;

public class ReleaseCase {
	
	private DatasItf datas = null;
	private BaseUtil util = null;
	
	public ReleaseCase() throws Exception{
		datas = new DatasItf();
		util = new BaseUtil();
	}
	@Test
	public void testcase() throws Exception{
		System.out.println("case  begin");
		this.util.driver.get(datas.getMainAddByName("beijing"));
		this.util.handler.clickXpath(MainPage.login_button);
		this.util.handler.clickXpath(LoginPage.user_pwd__button);
		this.util.handler.inputText(LoginPage.user_input, datas.getUserName());
		this.util.handler.inputText(LoginPage.pwd_input, datas.getPwd());
		this.util.handler.clickXpath(LoginPage.login_button);
		this.util.handler.clickXpath(MainPage.sanxing_label);
		Thread.sleep(5000);
		this.util.driver.quit();
		
		
		
		
		System.out.println("case  done");
	}
	
	
	public static void main(String args[]){
		try {
			
			new ReleaseCase().testcase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
