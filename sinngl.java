package devesh.LOGO.FE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sinngl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-devesh\\LOGO.FE\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		boolean b = s.isMultiple();
		System.out.println(b);
		

}
}