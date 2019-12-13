//package stepdefinitation;
//
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class dealsMapDefinition {
//	WebDriver driver;
//
//	@Given("^User is already on login page$")
//	public void user_is_already_on_login_page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://freecrm.com/");
//		driver.manage().window().maximize();
//
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		if (driver == null) {
//			driver = new ChromeDriver();
//		}
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
//
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//			driver.findElement(By.name("email")).sendKeys(data.get("username"));
//			driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		}
//
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
//
//		// JavascriptExecutor js = (JavascriptExecutor) driver;
//		// js.executeScript("argument[0].click()",loginbtn );
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginbtn);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//
//		// driver.findElement(By.className("ui fluid large blue submit
//		// button")).click();
//
//	}
//	
//	@When("^user moves to deal page$")
//	public void user_moves_to_deal_page() throws InterruptedException {
//	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span")).click();
//	    driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
//	    Thread.sleep(3000);
//	   
//	}
//
//
//	@Then("^user enters deals details and saves$")
//	public void user_enters_deals_details_and_saves(DataTable dealDetails) throws InterruptedException {
//		for (Map<String, String> data : dealDetails.asMaps(String.class, String.class)) {
//			
//			
//			driver.findElement(By.name("title")).sendKeys(data.get("title")); 
//			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
//			driver.findElement(By.name("description")).sendKeys(data.get("description"));
//			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();	//save						
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span")).click();// deals page
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click(); //new
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}
//
//	}
//
//	@Then("^closes the browser$")
//	public void closes_the_browser() {
//		driver.close();
//
//	}
//
//}
