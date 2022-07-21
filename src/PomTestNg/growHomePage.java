package PomTestNg;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growHomePage 
{
	
	WebDriver driver;
	//@FindBy(linkText="Login/Register") private WebElement xyz;
	@FindBy(xpath=("//span[@class='absolute-center']")) WebElement xyz;
	
	growHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicckkk()
	{
		 xyz.click();
	}
	
}
