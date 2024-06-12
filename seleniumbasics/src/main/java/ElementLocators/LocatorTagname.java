package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tag name

		WebDriver driver=new ChromeDriver(); //interface in selenium"webDriver", and implementation class"ChromeDriver".
		driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement allselect=driver.findElement(By.tagName("select"));
		allselect.click();
	}

}
