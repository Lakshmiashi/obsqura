package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		/* driver.get("https://selenium.qabible.in/check-box-demo.php");
		 driver.manage().window().maximize();*/
		 
		/*Xpath using text //tagname[contains(text(),'value of text')]
		  WebElement checkbox=driver.findElement(By.xpath("//label[contains(text(),'Click on this check box')]")); //xpath text
		 checkbox.click();*/
		
		 /*xpath using attribute //tagName[contains(@attribute,'value')]
		  
	
		 WebElement checkbox=driver.findElement(By.xpath("//label[contains(@for,'gridCheck')]")); 
		 checkbox.click();*/
		
		 /*star-with using text value  //tagName[starts-with(text(),'value')]
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 WebElement forgotten=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]")); 
		 forgotten.click();*/
		
		 //start with  using attribute value //tagName[starts-with(@attribute,'value')]
		driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 WebElement forgotten=driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com')]")); 
		 forgotten.click();

	}

}
