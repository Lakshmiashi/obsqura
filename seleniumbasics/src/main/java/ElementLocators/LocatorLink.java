package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linktext
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/login"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement forgotten=driver.findElement(By.linkText("Forgotten account?"));
		forgotten.click();
	}

}
