package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allcheckboxclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		 //here used star-with using text value  //tagName[starts-with(text(),'value')]
		  
		WebElement checkbox1=driver.findElement(By.xpath("//label[contains(text(),'Check ')]"));
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.xpath("//label[contains(text(),'Check Box Two')]"));
		checkbox2.click();
		
		WebElement checkbox3=driver.findElement(By.xpath("//label[contains(text(),'Check Box Three')]"));
		checkbox3.click();
		
		WebElement checkbox4=driver.findElement(By.xpath("//label[contains(text(),'Check Box Four')]"));
		checkbox4.click();
		
		WebElement checkbox5=driver.findElement(By.xpath("//label[contains(text(),'Click')]"));
		checkbox5.click();
				
		  

	}

}
