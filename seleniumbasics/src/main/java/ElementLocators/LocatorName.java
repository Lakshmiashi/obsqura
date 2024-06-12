package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); //interface in selenium"webDriver", and implementation class"ChromeDriver".
		driver.get("https://www.facebook.com/login/"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement emailID=driver.findElement(By.name("email"));
		emailID.sendKeys("lakshmibpillai9@gmail.com");
		
		/*using class name of password
		 WebElement password=driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
		WebElement button=driver.findElement(By.className("42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
		button.click();*/
		
		/*css
		driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement searchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchfield.click();
		searchfield.sendKeys("phone");
		driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement searchfield=driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect.nav-progressive-attrubute.nav-progressive-search-dropdown"));
		searchfield.click();*/
		
		/*tag name
		driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement allselect=driver.findElement(By.tagName("select"));
		allselect.click();*/
		
		/*linktext
		driver.get("https://www.facebook.com/login"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement forgotten=driver.findElement(By.linkText("Forgotten account?"));
		forgotten.click();*/
		
		/*partial linktext
		driver.get("https://www.facebook.com/login"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement forgotten=driver.findElement(By.partialLinkText("Forgotten "));
		forgotten.click();
		driver.close();
		driver.quit();// allwindow close*/
		
		
	}

}
