package orangeHRM_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_POM {
	WebDriver driver;
	By org_username = By.xpath("//input[@name='username']");
	By org_password = By.xpath("//input[@name='password']");
	By org_login = By.xpath("//button['Login']");
	By org_isDisplayed = By.className("oxd-topbar-header-title");
	By org_error = By.xpath("//p[text()='Invalid credentials']");
	public OrangeHRM_POM(WebDriver driver) {
		this.driver= driver;
	}
	
	public void orgUsername(String username) {
		driver.findElement(org_username).sendKeys(username);
	}
	
	public void orgPassword(String password) {
		driver.findElement(org_password).sendKeys(password);
	}
	
	public void orgLogin() {
		driver.findElement(org_login).click();
	}
	
	public void orgIsDisplayed() {
		driver.findElement(org_isDisplayed).isDisplayed();
		
	}
	
	public void orgError() {
		String txt = driver.findElement(org_error).getText();
		System.out.println("THE TEXT IS :" +txt);
	}
	

}
