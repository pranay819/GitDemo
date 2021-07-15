package stepsdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {

	public WebDriver driver;
	@Given("^User is on greenkart page$")
    public void user_is_on_greenkart_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay Nikam\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User search \"([^\"]*)\" vegetable$")
    public void user_search_something_vegetable(String strArg1) throws Throwable {
     driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(strArg1);
    }

    @Then("^\"([^\"]*)\" vegetables gets displayed$")
    public void something_vegetables_gets_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4[class='product-name']")).getText().contains(strArg1));
        
    	
    }
	
}
