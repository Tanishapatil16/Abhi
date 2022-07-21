package PomTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logingrow2
{
	
	@FindBy(xpath="//input[@id='login_password1']") private WebElement Passw;
	@FindBy(xpath="//div[@class='absolute-center btn51ParentDimension']") private WebElement submit;
	
	logingrow2(WebDriver dr)
	{
		PageFactory.initElements(dr,this);
	}
	
	public void EnterPass(String Pass)
	{
		Passw.sendKeys(Pass);
		//return Pass;
		
	}
	public void Button()
	{
		submit.click();
	}

}
