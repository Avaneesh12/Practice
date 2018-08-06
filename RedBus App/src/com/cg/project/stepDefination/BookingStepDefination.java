package com.cg.project.stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingStepDefination {

	private WebDriver driver;
	@Given("^User is on the google page$")
	public void user_is_on_the_google_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@When("^user searches for redbus on google$")
	public void user_searches_for_redbus_on_google() throws Throwable {
	    
	}

	@When("^user navigates to the website of redbus$")
	public void user_navigates_to_the_website_of_redbus() throws Throwable {
	    driver.get("https://www.redbus.in/");
	}

	@When("^enter details to search the bus$")
	public void enter_details_to_search_the_bus() throws Throwable {
	    driver.findElement(By.className("db")).sendKeys("Pune");
	    driver.findElement(By.id("dest")).sendKeys("Chennai");
	    //select date from calendar
	    driver.findElement(By.cssSelector("#search > div > div.fl.search-box.date-box.gtm-onwardCalendar > div > label")).click();
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='db text-trans-uc']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
	}
	@When("^navigates to view seats of bus$")
	public void navigates_to_view_seats_of_bus() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^select the kind of seat of the choice$")
	public void select_the_kind_of_seat_of_the_choice() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^clicks on proceed to confirm the booking$")
	public void clicks_on_proceed_to_confirm_the_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enter passenger details$")
	public void enter_passenger_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^will select the mode of payment$")
	public void will_select_the_mode_of_payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enters details of card to make final payment$")
	public void enters_details_of_card_to_make_final_payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on pay to confirm the seat$")
	public void click_on_pay_to_confirm_the_seat() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^successfull booking message should be displayed$")
	public void successfull_booking_message_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
