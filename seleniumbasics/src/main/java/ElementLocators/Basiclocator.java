package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Basiclocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//element locator  ID
		
		WebDriver driver=new ChromeDriver(); //interface in selenium"webDriver", and implementation class"ChromeDriver".
			driver.get("https://amazon.in"); //wait till page load not store history and cashe.
			driver.manage().window().maximize();  //for maximize window
			WebElement searchField=driver.findElement(By.id("twotabsearchtextbox")); //web element declaring syntax.
			searchField.click();
			searchField.sendKeys("Mobile"); //for entering data.
            searchField.clear(); //for clear data(mobile).
	}

}
