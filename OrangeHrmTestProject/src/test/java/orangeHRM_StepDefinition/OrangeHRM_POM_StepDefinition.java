package orangeHRM_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.bytebuddy.implementation.bytecode.Throw;
import orangeHRM_POM.OrangeHRM_POM;

public class OrangeHRM_POM_StepDefinition {
	WebDriver driver;
	OrangeHRM_POM org_pom;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/java program/FinalProject/src/test/resources/driver/chromedriver.exe");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	@Given("user is on OrangeHRM login page")
	public void user_is_on_orange_hrm_login_page() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		System.out.println("USER IS ON ORANGEHRM PAGE");
	}

	@And("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) throws InterruptedException {
		org_pom =new OrangeHRM_POM(driver);
		org_pom.orgUsername(string);
		org_pom.orgPassword(string2);
		Thread.sleep(3000);
		System.out.println("USER ENTERS USERNAME AND PASSWORD");
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		org_pom.orgLogin();
		Thread.sleep(3000);
		System.out.println("USER CLICK ON LOGIN BUTTON");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		org_pom.orgIsDisplayed();
		String url =driver.getCurrentUrl();
		System.out.println("THE URL OF THE HOME PAGE IS :" +url);
	}

	@Then("invalid credentials message should be displayed")
	public void invalid_credentials_message_should_be_displayed() {
		try {
			if(driver.getTitle().equals("https://opensource-demo.orangehrmlive.com"));
			System.out.println("THE GIVEN CREDENTIAL IS INVALID");
				
		} catch (Exception e) {
			System.out.println("The given credentials are valid");
		}
		String urls =driver.getCurrentUrl();
		System.out.println("THE URL OF THE CURRENT PAGE IS :" +urls);
		org_pom.orgError();
	
		
	}

}
