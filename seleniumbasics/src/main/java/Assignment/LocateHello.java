package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.manage().window().maximize();
		 
		 WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		 message.sendKeys("Hello");
		 
		 WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		 showmessage.click();
		

	}

}
