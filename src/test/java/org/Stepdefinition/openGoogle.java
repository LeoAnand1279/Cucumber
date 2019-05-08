package org.Stepdefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class openGoogle {
	
	

	public static  WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SysSoft\\eclipse-workspace\\Employee details\\Cucuumber\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@When("Send particular details")
	public void send_particular_details() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("html");
		driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("juju");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiki@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("lovoe");
		driver.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("468664");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("Submit and generate ID")
	public void submit_and_generate_ID() {
	   Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]")).isDisplayed());
	}
	}


