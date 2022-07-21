package other_celenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("C:\\Users\\Aa\\Desktop\\Newfolder\\checkbox.html");
		
		List<WebElement> checkbox = dr.findElements(By.xpath("//input[@type='checkbox']"));
		
		//1)--------For counting Size of checkbox

		int count = checkbox.size();
		System.out.println(count);
		
		//2)For click checkbox
		
         checkbox.get(1).click();
         
         //3)  To click all checkboxes same time
         
         for(WebElement Box:checkbox)
         {
        	 Box.click();
        		       	 
         }
         
         
         
         

	}

}
