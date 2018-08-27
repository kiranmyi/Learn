package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoContsant{
	
	public WebDriver driver;
	static
	{
		System.setProperty(chrome_key,chrome_value);
		System.setProperty(gecko_key,gecko_value);
		
	}
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
		
	}

}
