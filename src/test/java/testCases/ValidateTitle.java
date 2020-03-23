package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkDesignPackage.BasePage;
import pageObjects.LandLoginPage;
import pageObjects.LoginPage;

public class ValidateTitle extends BasePage{
	
	@BeforeTest
	
	public void initalizeTest() throws IOException {
		driver =	initializeDriver();
		
	}

		@Test
		public void BasePageNavigation() throws IOException {
			// initialization the driver and hitting the url site.
			driver.get(prop.getProperty("url"));
		LandLoginPage l = new LandLoginPage(driver);
		Assert.assertEquals(l.getText_FeaturedCourses().getText(), "FEATURED COURSES");
			
		}
	
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
		
		}



	


