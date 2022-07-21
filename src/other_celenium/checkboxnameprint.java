package other_celenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxnameprint {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("C:\\Users\\Aa\\Desktop\\Newfolder\\checkbox.html");
		
		List<WebElement> Cd = dr.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(Cd.size());
		
		for(WebElement Ab:Cd)
		{
			System.out.println(Ab.getText());
			Thread.sleep(2000);
		}

	}

}
