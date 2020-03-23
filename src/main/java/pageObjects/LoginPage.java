/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author hchatha
 *
 */
public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	private By email = By.xpath("//input[contains(@id,'user_email')]");
	private By password = By.xpath("//input[contains(@id,'user_password')]");
	private By loginButton = By.xpath("//input[contains(@id,'user_password')]");


	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public void setEmail(By email) {
		this.email = email;
	}
	public WebElement  getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	public void setLoginButton(By loginButton) {
		this.loginButton = loginButton;
	}
	public void setPassword(By password) {
		this.password = password;
	}

}
