//package stepdefinitation;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class loginstepdef {
//
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
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
//		System.out.println(title);
//
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username(String username, String password) {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws InterruptedException {
//	 WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
//
//		// JavascriptExecutor js = (JavascriptExecutor) driver;
//		// js.executeScript("argument[0].click()",loginbtn );
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", loginbtn);
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 Thread.sleep(3000);
//
//		//driver.findElement(By.className("ui fluid large blue submit button")).click();
//		 
//
//	}
//
//	
//	@And("^is already on home page$")
//	public void is_already_on_home_page() throws InterruptedException  {
//		if (driver == null) {
//		    driver = new ChromeDriver();
//		}
//	//	JavascriptExecutor js = (JavascriptExecutor)driver;	
//	//	String TitleName = js.executeScript("return document.getElementsByTagName('title')[0].innerHTML;").toString();
//		Thread.sleep(3000);
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//		System.out.println(title);
//	}
//
//	@When("^user clicks on contacts link$")
//	public void user_clicks_on_contacts_link() {
//		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
//	}
//
//	@Then("^user clicks on new contacts link$")
//	public void user_clicks_on_new_contacts_link()  {
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
//
//	}
//
//	@Then("^user enters first and last name$")
//	public void user_enters_first_and_last_name()  {
//		driver.findElement(By.name("first_name")).sendKeys("FirstName1");
//		driver.findElement(By.name("last_name")).sendKeys("LastName2");
//
//	}
//
//	@Then("^user clicks on save button$")
//	public void user_clicks_on_save_button() throws InterruptedException  {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(5000);
//	}
//
//	@Then("^verify if new contact is created$")
//	public void verify_if_new_contact_is_created() throws InterruptedException {
//		System.out.println("---------------------");
//		System.out.println(driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[1]")).getText());
//		Thread.sleep(5000);
//		
//	}
//	
//	
//	@Then("^user enters details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_details_and_and(String username, String password, String email)  {
//		//driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
//		driver.findElement(By.name("first_name")).sendKeys(username);
//		driver.findElement(By.name("last_name")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")).sendKeys(email);
//	}
//
//	@Then("^closes the browser$")
//	public void closes_the_browser()  {
//		driver.close();
//	    
//	}
//
//
//}
