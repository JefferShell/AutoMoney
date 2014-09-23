package com.chanjet.testcase;

import org.testng.annotations.Test;

import com.chanjet.datas.DatasItf;
import com.chanjet.datas.UserInfo;
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
