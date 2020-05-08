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
import com.training.pom.RetailRegisterTestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailRegisterTest {

	private WebDriver driver;
	private String baseUrl;
	private RetailRegisterTestPOM retailPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailPOM = new RetailRegisterTestPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1500);
		driver.quit();
	}

	@Test
	public void registerDetails() throws Exception {
		retailPOM.accntClk();
		retailPOM.ClkLoginRegister();
		retailPOM.registerClick();
		retailPOM.enterFName("Test");
		retailPOM.enterLName("Register2");
		retailPOM.enterEmail("test10@gmail.com");
		retailPOM.enterTPhone("7152431234");
		retailPOM.enterAddress1("Vijayanagar");
		retailPOM.enterAddress2("bangalore");
		retailPOM.enterCity("bangalore");
		retailPOM.enterPinCode("560022");
		retailPOM.selectCountry();
		retailPOM.selectState();
		retailPOM.enterPassword("password1");
		retailPOM.confirmPassword("password1");
		retailPOM.selectNoRadioBtn();
		retailPOM.checkCheckBox();
		retailPOM.continueButton();
		retailPOM.verifyTheMessage();
		screenShot.captureScreenShot("First");
	}
}
