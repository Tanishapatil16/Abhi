package PomobjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifHomePage 
{
	WebDriver driver;
	By Login=By.linkText("Sign in");
	
	
	
	public RedifHomePage(WebDriver driver2) 
	{
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}


	public WebElement Login()
	{
		return driver.findElement(Login);
	}
	

}
