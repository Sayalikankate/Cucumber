//package stepdefinitation;
//
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//
//public class hooksStepdef {
//	
//	WebDriver driver;
//	
//	@Before
//	public void launch() throws Exception {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://freecrm.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
//		driver.findElement(By.name("email")).sendKeys("sayali151995@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Sayali@24");
//		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginbtn);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		
//	}
//	
//	@After
//	public void closeBrowser() {
//		driver.close();
//		
//	}
//	
//	@When("^user clicks on contacts link$")
//	public void user_clicks_on_contacts_link() throws Exception {
//		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
//	    
//	}
//
//	@Then("^user clicks on new contacts link$")
//	public void user_clicks_on_new_contacts_link(){
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
//	    
//	}
//
//	@Then("^user enters details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_details_and_and(String username, String password, String email)  {
//		driver.findElement(By.name("first_name")).sendKeys(username);
//		driver.findElement(By.name("last_name")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")).sendKeys(email);
//	}
//
//	@Then("^user clicks on save button of details page$")
//	public void user_clicks_on_save_button_of_details_page() throws Exception {
//		
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(5000);
//	}
//	
//	@Then("^user enters deals details$")
//	public void user_enters_deals_details(DataTable dealDetails) throws Exception {
//		if(driver==null)
//			driver = new ChromeDriver();
//		 driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span")).click();
//		 
//		 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
//		 Thread.sleep(3000);
//		List<List<String>> data = dealDetails.raw();
//	    driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
//	    driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
//	    driver.findElement(By.name("description")).sendKeys(data.get(0).get(2));
//	}
//
//
//}
