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
import com.training.pom.RetailRegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailRegisterTest {

	private WebDriver driver;
	private String baseUrl;
	private RetailRegisterPOM retailPOM;
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
		retailPOM = new RetailRegisterPOM(driver);
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

	@Test(priority = 1, enabled = true)
	public void registerDetails() throws Exception {
		retailPOM.accntClk();
		retailPOM.ClkLoginRegister();
		retailPOM.registerClick();
		retailPOM.enterFName("Test");
		retailPOM.enterLName("Register4");
		retailPOM.enterEmail("test12@gmail.com");
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
		screenShot.captureScreenShot("AccountRegister");
	}

	@Test(priority = 2, enabled = true)
	public void loginWithValidId() {
		retailPOM.accntClk();
		retailPOM.ClkLoginRegister();
		retailPOM.sendEmailAddress("test009@gmail.com");
		retailPOM.enterPassword("password1");
		retailPOM.clickLoginBtn();
		screenShot.captureScreenShot("LoginWithValidID");
	}

	@Test(priority = 3, enabled = true)
	public void recoverLogin() {
		retailPOM.accntClk();
		retailPOM.ClkLoginRegister();
		retailPOM.sendEmailAddress("manzoor@gmail.com");
		retailPOM.enterPassword("manzoor");
		retailPOM.forgotPasswordLink();
		retailPOM.recoverEmailAddress("manzoor@gmail.com");
		retailPOM.clickContinue();
		screenShot.captureScreenShot("RecoverLoginId");
	}

}
