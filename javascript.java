package devesh.LOGO.FE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-devesh\\LOGO.FE\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').setAttribute('value','devesh')");
		Object s = js.executeScript("return document.getElementById('email').getAttribute('value')");
       driver.findElement(By.id("loginbutton")).click();
	}

}
