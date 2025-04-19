package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UrbanladderSteps {
	
	WebDriver driver;
	
	@Given("I launch browser and navigate to the home page")
	public void i_launch_browser_and_navigate_to_the_home_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.urbanladder.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("The homepage should be displayed")
	public void the_homepage_should_be_displayed() {
		driver.findElement(By.xpath("//section[@class='header__topBar_sectionLeft']")).isDisplayed();
	}

	@Then("I search for {string}")
	public void i_search_for(String string) throws InterruptedException {
	   driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Sofa");
	   driver.findElement(By.xpath("//button[@id='search_button']")).click();
	   driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	   Thread.sleep(3000);
	   //driver.findElement(By.xpath("//body[@class='two-col ul_desktop body_products modal-open']")).click();
	  // Thread.sleep(3000);
	}

	@When("Search results should be displayed")
	public void search_results_should_be_displayed() {
		driver.findElement(By.xpath("//span[@class='key']")).isDisplayed();
	}

	@When("I apply a filter")
	public void i_apply_a_filter() {
//		Actions ac = new Actions(driver);
//		ac.moveToElement("(//div[@class='gname'])[1]").click().build().perform();
		driver.findElement(By.xpath("(//div[@class='gname'])[1]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Fabric Sofa Sets']")).click();
		driver.findElement(By.xpath("(//div[@class='filter-section fixedmenu'])[1]")).click();
		
	}

	@Then("The search results should be updated")
	public void the_search_results_should_be_updated() {
		driver.findElement(By.xpath("(//span[@class='text'][normalize-space()='Fabric Sofa Sets'])[1]")).isDisplayed();
	}

	@When("I add a product to the cart")
	public void i_add_a_product_to_the_cart() {
		driver.findElement(By.xpath("(//img[@title='Walton Sofa (Asphalt Grey)'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Add to Cart'])[1]")).click();
	}

	@Then("The product should be in the cart")
	public void the_product_should_be_in_the_cart() {
		driver.findElement(By.xpath("(//span[@class='wishtext_login'])[1]")).isDisplayed();
	}

	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {
		driver.findElement(By.xpath("(//button[@id='checkout-link'])[2]")).click();
	}

	@Then("The checkout page should load successfully")
	public void the_checkout_page_should_load_successfully() {
		driver.findElement(By.xpath("(//div[@class='shipping_address'])[1]")).isDisplayed();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]")).sendKeys("shubhamgiri1709@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"PIN Code\"]")).sendKeys("560068");
		driver.findElement(By.xpath("//input[@placeholder=\"Address\"]")).sendKeys("HSR road near masai School , Bengaluru");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Giri");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter 10 digit mobile number\"]")).sendKeys("7972571443");
		driver.findElement(By.xpath("//input[@value=\"Save and Continue\"]")).click();
		
	}


}
