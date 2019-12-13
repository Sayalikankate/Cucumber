package stepdefinitation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dealStepdef {
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		if(driver==null) {
			driver= new ChromeDriver();
		}
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		List<List<String>> data= credentials.raw();
		
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	  
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
	 WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("argument[0].click()",loginbtn );
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginbtn);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(3000);

		//driver.findElement(By.className("ui fluid large blue submit button")).click();
		 

	}

	

	@When("^user moves to deal page$")
	public void user_moves_to_deal_page() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
	    Thread.sleep(3000);
	   
	}

	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealDetails) {
	    List<List<String>> data = dealDetails.raw();
	    driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.name("description")).sendKeys(data.get(0).get(2));
	    
	}

	@Then("^user clicks on deals save button$")
	public void user_clicks_on_deals_save_button() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	   
	}
	@Then("^closes the browser$")
	public void closes_the_browser()  {
		driver.close();
	    
	}

	

}
