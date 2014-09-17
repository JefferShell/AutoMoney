package com.chanjet.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import com.chanjet.page.LoginPage;
import com.chanjet.utils.Common;
import com.chanjet.utils.Config;
import com.chanjet.utils.Handler;

public class BaseCase {
	public WebDriver driver = null;
	public Handler handler = null;
	public Config  config = null;
	private String configPath = "AutotestConfig.properties";
	
	public BaseCase() throws Exception {
		System.out.println("---------------------");
		init();
		
	}
	
	private void init() throws Exception {
		// TODO 初始化程序，读取配置文件
		config = new Config(configPath);
		if(config.getString("Explorer").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(config.getString("Explorer").equals("Firefox")){
			System.setProperty("webdirver.firefix.bin", "E:/FireFox/firefox.exe");
			driver = new FirefoxDriver();
		}
		handler = new Handler(driver);
	}
	@AfterClass
	public void tearDown() throws Exception {
		
		System.out.println("用例完成");
		driver.quit();
	}
}
