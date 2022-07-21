package other_celenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("file:///C:/Users/Aa/Downloads/tables.html");
		
		List<WebElement> SS = dr.findElements(By.xpath("//table[@id='abc123']/tbody/tr"));

		System.out.println(SS.size());
		
		System.out.println("----------------");
		
		//2)----Ccccolucmn size---------
		
		List<WebElement> SS2 = dr.findElements(By.xpath("//table[@id='abc123']/tbody/tr[1]/th"));
		System.out.println("Coloumn size="+SS2.size());
		
		for(WebElement col:SS2)
		{
			System.out.println(col.getText());
		}
		
		
		
	}

}
