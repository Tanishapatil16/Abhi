package PomTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logingroww1
{
	
	// step1  :---Declare Data Members globally with an access level private
	
	@FindBy(xpath="//input[@id='login_email1']") private WebElement Email;
	@FindBy(xpath="//div[@class='absolute-center btn51ParentDimension']") private WebElement Continue;

	
	//step 2:Initialise within constructor with access level public
	
	Logingroww1(WebDriver dr)
	{
		PageFactory.initElements(dr,this);
	}
	
	//step 3:utilize within a method with access level public
	
	public void Entermail(String Email1)
	{
		Email.sendKeys(Email1);
		//return Email;
		
	}
	
	public void click()
	{
		Continue.click();
	}
}
