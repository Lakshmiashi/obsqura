package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpartiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//partial linktext
		        WebDriver driver=new ChromeDriver(); 
				driver.get("https://www.facebook.com/login"); //wait till page load not store history and cashe.
				driver.manage().window().maximize();  //for maximize window
				WebElement forgotten=driver.findElement(By.partialLinkText("Forgotten "));
				forgotten.click();
				//driver.close(); //first tab ,current control parent tab here calling using get closed. 
				//driver.quit();//full tab closed.

}
}
