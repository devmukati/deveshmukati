package devesh.LOGO.FE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winjdo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-devesh\\LOGO.FE\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.249758790.1187329337.1570455337-774274990.1570455337");
	driver.switchTo().frame(0);
	driver.findElement(By.name("fldLoginUserId")).sendKeys("kartika");
	
	}

}
