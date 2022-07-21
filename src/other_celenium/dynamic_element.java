package other_celenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element {

	public static void main(String[] args) throws InterruptedException 
	{
		String Actual="lenovo k6 note battery";
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://google.com");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("lenovo k6 note ");
		Thread.sleep(2000);
		List<WebElement> lenovo = dr.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement act:lenovo)
		{
			String ST=act.getText();
			System.out.println(ST);
			if(ST.equals(Actual))
			{
				act.click();
				break;
			}
			
			
		}
		

	}

}
