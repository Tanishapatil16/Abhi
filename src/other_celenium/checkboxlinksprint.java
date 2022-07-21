package other_celenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxlinksprint {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("C:\\Users\\Aa\\Desktop\\Newfolder\\checkbox.html");
		
		List<WebElement> checkbox = dr.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<=checkbox.size()-1;i++)
		{
			System.out.println(checkbox.get(i));
		}
		System.out.println("-------------------------");
		
		for(int i=checkbox.size()-1;i>=0;i--)
		{
			System.out.println(checkbox.get(i));
			
		}
		
		
	}

}
