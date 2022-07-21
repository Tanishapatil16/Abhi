package other_celenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element2 {

	public static void main(String[] args) throws InterruptedException 
	{
		String actual="top 10 it companies in india";
		System.setProperty("webdriver.chrome.driver","D:\\Path\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://google.com");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Top 10");
		
		Thread.sleep(2000);
		
		List<WebElement> options = dr.findElements(By.xpath("//ul[@class='G43f7e']//li[2]"));
		
		
		
		
		for(WebElement op:options)
		{
			String Exp=op.getText();
			if(actual.equals(Exp))
			{
				op.click();
				break;
			}
			
		}
		
		
		
		//String com = dr.findElement(By.xpath("//ul[@class=\"i8Z77e\"]//li[1]")).getText();
		//System.out.println(com);
		
		
		
		

	}

}
