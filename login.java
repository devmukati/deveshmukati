package devesh.LOGO.FE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
WebDriver driver;
	@Given("^url launch$")
	public void url_launch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-devesh\\LOGO.FE\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Given("^url check$")
	public void url_check(){
		String url = driver.getCurrentUrl();
		if (url.contains("facebook")) {
			System.out.println("open");
			
		} else {
			System.out.println("not open");

		}
	
	}

@When("^username and password \"([^\"]*)\" and  \"([^\"]*)\"$")
public void username_and_password_and(String em, String pa) {
	driver.findElement(By.id("email")).sendKeys(em);
driver.findElement(By.id("pass")).sendKeys(pa);
}

@When("^firstname and lastname  \"([^\"]*)\"  and  \"([^\"]*)\"$")
public void firstname_and_lastname_and(String fn, String ln){
	driver.findElement(By.name("firstname")).sendKeys(fn);
	driver.findElement(By.name("lastname")).sendKeys(ln);
		
		}

		@When("^loginbuttion$")
		public void loginbuttion(){
			driver.findElement(By.id("loginbutton")).click();

		}
		@Then("^navigetion$")
		public void navigetion(DataTable Examples) {
		driver.close();
		}
}
