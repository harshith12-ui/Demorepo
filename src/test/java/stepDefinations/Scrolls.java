package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolls {
	WebDriver driver;
	WebElement ele;
	JavascriptExecutor js;
	@Given("^user navigate to news(\\d+) HomePge$")
	public void user_navigate_to_news_HomePge(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.news18.com/");
	    driver.manage().window().maximize();
	    
	}

	@When("^user scroll till end of footer of Home Page and top of Home page$")
	public void user_scroll_till_end_of_footer_of_Home_Page_and_top_of_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=0;i<4;i++)
		{
		js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,2200)");
		   Thread.sleep(2000);
		}
	    
	}

	@When("^user verify Trending topic and language section$")
	public void user_verify_Trending_topic_and_language_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='link_table w3 trand']//a"));
		int count = link.size();
		System.out.println(count);
		for(WebElement we : link) {
			String text = we.getText();
			System.out.println(text);
		}
		
		
	   
	}

	@Then("^Trendind Topic and language section should be displayed$")
	public void trendind_Topic_and_language_section_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=0;i<4;i++)
		{
		js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,-2200)");
		   Thread.sleep(2000);
		}
		
	   driver.findElement(By.xpath("//*[@id=\"mc_mainWrapper\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div")).click();
	   driver.findElement(By.xpath("//a[text()='हिन्दी ']")).click();
	   
	   
	   
	}



}
