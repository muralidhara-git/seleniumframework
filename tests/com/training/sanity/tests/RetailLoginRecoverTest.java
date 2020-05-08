package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailLoginPOM;
import com.training.pom.RetailLoginRecoverPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailLoginRecoverTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RetailLoginPOM retailLoginPOM;
	private RetailLoginRecoverPOM recoverLoginPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		recoverLoginPOM = new RetailLoginRecoverPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void validLoginTest() {
		recoverLoginPOM.accntClk();
		recoverLoginPOM.ClkLoginRegister();
		recoverLoginPOM.sendEmailAddress("manzoor@gmail.com");
		recoverLoginPOM.sendPassword("manzoor");
		recoverLoginPOM.forgotPasswordLink();
		recoverLoginPOM.recoverEmailAddress("manzoor@gmail.com");
		recoverLoginPOM.clickLoginBtn();
		screenShot.captureScreenShot("Four");
	}
}
