package other_celenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		List<WebElement> links = dr.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		//System.out.println(links.get(5));
		
		for(WebElement Ab:links)
		{
			System.out.println(Ab.getText());
			
		}
		System.out.println("------------");
		
		for(int i=0;i<=links.size()-1;i++)
		{
			System.out.println(links.get(i));
		}

	}

}
