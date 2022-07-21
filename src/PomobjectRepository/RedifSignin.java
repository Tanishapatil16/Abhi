package PomobjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedifSignin
{
	WebDriver dr;
	@FindBy(xpath=("//input[@id='login1']")) private WebElement username;
	@FindBy(id="password") private WebElement password;
	
	public RedifSignin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement UsrName()
	{
		return username;
	}
	
	public void pass()
	{
		password.sendKeys("Tanu");
	}

}
