package launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Launchedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\ASUS\\Desktop\\edge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //for launch for latest browser not needsystemprop step only second step
		driver.navigate().to("https://www.javatpoint.com/types-of-exception-in-java");
		driver.navigate().refresh();
		driver.navigate().to("https://www.w3schools.com/java/"); //here history and cashe store inbuill 
		driver.navigate().back();   //to go to previous page.
		driver.navigate().forward();// forwared page.
	}

}
