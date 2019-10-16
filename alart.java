package devesh.LOGO.FE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-devesh\\LOGO.FE\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		WebElement log = driver.findElement(By.id("login1"));
log.sendKeys("gurjar12");		
		}
	}


