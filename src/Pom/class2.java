package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class2 
{
	
	@FindBy(xpath="//input[@id='login_password1']") private WebElement Pass;
	@FindBy(xpath="//div[@class='absolute-center btn51ParentDimension']") private WebElement submit;
	
	class2(WebDriver dr)
	{
		PageFactory.initElements(dr,this);
	}
	
	public void EnterPass()
	{
		Pass.sendKeys("Pass12345");
		
	}
	public void Button()
	{
		submit.click();
	}

}
