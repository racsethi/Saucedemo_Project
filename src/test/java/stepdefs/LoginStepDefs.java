package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

	WebDriver driver= Baseclass.driver;
	
	   @Given("^User has laumched the Swag Labs Application$")
	    public void user_has_laumched_the_swag_labs_application() throws Throwable {
	       
		   driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	        
	        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOf(LoginLink));
	        
	        LoginLink.click();
	    }

	    @When("^User enters username \"([^\"]*)\"$")
	    public void user_enters_username_something(String UserName) throws Throwable {
	      
	    	  WebElement name= driver.findElement(By.xpath("//input[@id = 'user-name']"));
		       name.sendKeys(UserName);
	    }

	   	    @And("^User enters password \"([^\"]*)\"$")
	    public void user_enters_password_something(String password) throws Throwable {
	       
	   	     WebElement Password = driver.findElement(By.cssSelector("input[id=password]"));
		       Password.sendKeys(password);
	    }
	   	    

	    @And("^User clicks on Login Button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	
	    	WebElement LoginButton = driver.findElement(By.cssSelector("input[id =login-button]"));
	        LoginButton.click();
	    
	    	
	    }
	    
	    @Then("^User Should be landed on the Products Page$")
	    public void user_should_be_landed_on_the_products_page() throws Throwable {
	    	
	    	WebElement check_status = driver.findElement(By.xpath("//span[text()='Products']"));
			
			String Expected ="PRODUCTS";
			Assert.assertEquals(Expected, check_status.getText());
			
	    }
	    
	    @Then("^User Should Get \"([^\"]*)\"$")
	    public void user_should_get_something(String error) throws Throwable {
	    	
	      WebElement error_button = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"));
	      Assert.assertEquals(error, error_button.getText());
	    }

	    }



	

