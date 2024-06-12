package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		// here using  xpath using attribute //tagName[contains(@attribute,'value')]
		
		WebElement radiomale=driver.findElement(By.xpath("//label[contains(@for,'inlineRadio1')]"));
		radiomale.click();
		
		WebElement radiofemale=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		radiofemale.click();
		
		WebElement show=driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]"));
		show.click();
		
		
	}

}
