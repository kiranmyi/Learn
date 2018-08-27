package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id="email")
	private WebElement emailTB;
	@FindBy(id="pass")
	private WebElement passwordTB;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement click;
	
	public LoginPage(WebDriver driver)
	{ 
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void enterEmail()
	{
		emailTB.sendKeys("kiran");
	}
	public void enterPassword()
	{
		passwordTB.sendKeys("kiran");
	}
	public void clickOn()
	{
		click.click();
	}
	
	
	

}
