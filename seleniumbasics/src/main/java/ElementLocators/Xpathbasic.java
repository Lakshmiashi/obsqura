package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbasic {
public static void main(String args[])
{
	 WebDriver driver=new ChromeDriver(); 
	 
	 /*driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
	 driver.manage().window().maximize();
	 WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); //relative xpath.
	 search.sendKeys("shirts");*/
	 driver.get("https://www.facebook.com/login/");
	 WebElement login=driver.findElement(By.xpath("/button[text()='Log in']"));
	 login.click();
}
}
