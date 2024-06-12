package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorbyclsname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Element locator by ClassName
		
		WebDriver driver=new ChromeDriver(); //interface in selenium"webDriver", and implementation class"ChromeDriver".
		driver.get("https://www.facebook.com/login/"); //wait till page load not store history and cashe.
		 /*WebElement password=driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
		 password.click();*/
		WebElement button=driver.findElement(By.className("42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
		button.click();

}
}
