package PomobjectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHome 
{
	WebDriver dr;
	@FindBy(id="email")private WebElement username;
	@FindBy(id="pass") private WebElement password;
	
	  public FacebookHome(WebDriver dr)
	{
		//PageFactory.initElements(dr,this);
		PageFactory.initElements(dr, this);
	}
	
	public void Name()
	{
		username.sendKeys("Tanu");
	}
	public void PAss()
	{
		password.sendKeys("Patil");
	}
	
	
	
}
