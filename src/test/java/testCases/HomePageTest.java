package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkDesignPackage.BasePage;
import pageObjects.LandLoginPage;
import pageObjects.LoginPage;

public class HomePageTest extends BasePage{
	
	@BeforeTest
	public void intializeTest() throws IOException {
		driver =	initializeDriver();
		
		
	}
	  
		LandLoginPage l = new LandLoginPage(driver);
		@Test(dataProvider ="getData")
		public void TestBasePageNavigation(String email, String passWord,String text) throws IOException {
			driver.get(prop.getProperty("url"));
			// initialization the driver and hitting the url site.
		LandLoginPage l = new LandLoginPage(driver);
//		l.clickNoTHanksOnPopUp();
		l.clickLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(passWord);
		System.out.println(text);
		lp.getLoginButton().click();
			
		}
				// first array will be the test case 0 (is the first test because of index
				// 2nd array will be the number of data passed > pass into the argument 
		@DataProvider
		public Object[][] getData(){
				Object[][] date = new Object[2][3];
				date[0][0] ="Useremail";
				date[0][1] ="password";
				date[0][2] ="Real usr";
				// 2nd user name passoword
				date[1][0] ="nonUseremail";
				date[1][1] ="password";
				date[1][2] ="banned user";
				
				return date;
		}

			public void teardown() {
				driver.quit();
			}
	}


