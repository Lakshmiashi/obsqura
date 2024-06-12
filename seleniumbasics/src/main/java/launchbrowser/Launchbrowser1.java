package launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launchbrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\slenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
   // ChromeDriver driver=new ChromeDriver(); 
     //driver=new EdgeDriver();
	driver.get("https://www.w3schools.com/java/"); //wait till page load not store history and cashe.
	driver.manage().window().maximize();  //for maximize window
	
	
	}
	

}
