package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;

import com.training.pom.RetailRegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
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
		// loginPOM = new LoginPOM(driver);
		retailPOM = new RetailRegisterPOM(driver);

		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class, enabled = true)
	public void loginExcelTest(String firstname, String lastname, String email, String telephone, String address1,
			String address2, String city, String pincode, String country, String region, String password,
			String confmpassword) {

		// loginPOM.sendEmailAddress(userName);
		// loginPOM.enterPassword(password);
		// loginPOM.clickLoginBtn();
		// screenShot.captureScreenShot(userName);
		retailPOM.accntClk();
		retailPOM.ClkLoginRegister();
		retailPOM.registerClick();
		retailPOM.enterFName(firstname);
		retailPOM.enterLName(lastname);
		retailPOM.enterEmail(email);
		retailPOM.enterTPhone(telephone);
		retailPOM.enterAddress1(address1);
		retailPOM.enterAddress2(address2);
		retailPOM.enterCity(city);
		retailPOM.enterPinCode(pincode);
		retailPOM.selectCountry();
		retailPOM.selectState();
		retailPOM.enterPassword(password);
		retailPOM.confirmPassword(confmpassword);
		retailPOM.selectNoRadioBtn();
		retailPOM.checkCheckBox();
		retailPOM.continueButton();
		retailPOM.verifyTheMessage();
		screenShot.captureScreenShot("Multiple user successful register through Excel");

	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class, enabled = false)
	public void loginExcelTest1(String firstname, String lastname, String email, String telephone, String address1,
			String address2, String city, String pincode, String country, String region, String password,
			String confmpassword) {

		retailPOM.accntClk();
		retailPOM.ClkLoginRegister();
		retailPOM.registerClick();
		retailPOM.enterFName(firstname);
		retailPOM.enterLName(lastname);
		retailPOM.enterEmail(email);
		retailPOM.enterTPhone(telephone);
		retailPOM.enterAddress1(address1);
		retailPOM.enterAddress2(address2);
		retailPOM.enterCity(city);
		retailPOM.enterPinCode(pincode);
		retailPOM.selectCountry();
		retailPOM.selectState();
		retailPOM.enterPassword(password);
		retailPOM.confirmPassword(confmpassword);
		retailPOM.selectNoRadioBtn();
		retailPOM.checkCheckBox();
		retailPOM.continueButton();
		retailPOM.verifyTheMessage();
		screenShot.captureScreenShot("Multiple user unsuccessful register through Excel");

	}

}