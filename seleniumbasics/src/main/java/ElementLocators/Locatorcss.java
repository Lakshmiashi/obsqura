package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//css by id
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement searchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchfield.click();
		searchfield.sendKeys("phone");
		
		//2nd css by class attribute value.
		
		/*driver.get("https://www.amazon.in"); //wait till page load not store history and cashe.
		driver.manage().window().maximize();  //for maximize window
		WebElement searchfield=driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect.nav-progressive-attrubute.nav-progressive-search-dropdown"));
		searchfield.click();*/

	}

}
