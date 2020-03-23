/**
 * 
 */
package FrameworkDesignPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hchatha
 *
 */
public class BasePage {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		
	 prop = new Properties();
			// FIle input stream will map the location of the property where browser is being calls ( "data.prperties")
				FileInputStream fis = new FileInputStream("C:\\Users\\hchatha\\eclipse-workspace\\QAFrameworkMarch22\\src\\main\\java\\FrameworkDesignPackage\\data.properties");
			// prop objbect 
				prop.load(fis);
		String BrowserName =  prop.getProperty("browser");
		System.out.println(BrowserName);
		if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (BrowserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else {
			System.err.println("No browser is invoked");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// returning driver so anybody can use this 
		return driver;
		
	}
	
	public void getScreenShot() throws IOException {
	File srcreenshotFile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//save from Vitural to local with Fileutils
	FileUtils.copyFile(srcreenshotFile, new File("C://test//screenshot.png"));
		
	}

}
