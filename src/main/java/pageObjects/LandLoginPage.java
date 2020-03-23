/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author hchatha
 *
 */
public class LandLoginPage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public LandLoginPage(WebDriver driver) {
		this.driver = driver;	
		this.wait = wait;
	}
	
	private By loginlink = By.xpath("//a[contains(@href,'sign_in')]");
	private By clickNoThanksOnPopUp = By.xpath("//button[contains(.,'NO THANKS')]");
	private By text_FeaturedCourses = By.cssSelector(".text-center>h2");
	
	
	public WebElement getText_FeaturedCourses() {
		return driver.findElement(text_FeaturedCourses);
	}

	public void setText_FeaturedCourses(By text_FeaturedCourses) {
		this.text_FeaturedCourses = text_FeaturedCourses;
	}

	public WebElement clickLogin() {
	return 	driver.findElement(loginlink);
	}
	
	public WebElement clickNoTHanksOnPopUp() {
		return	driver.findElement(clickNoThanksOnPopUp);
	}

}
