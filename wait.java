package devesh.LOGO.FE;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-devesh\\LOGO.FE\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
try {
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("devmukati");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mukatyuu");		
}catch (Exception e) {
System.out.println(e);
}
	
}
}


