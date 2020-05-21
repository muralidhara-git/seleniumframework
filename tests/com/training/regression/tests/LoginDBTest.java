package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailRegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
	private RetailRegisterPOM retailPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods;

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
		genericMethods = new GenericMethods(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String firstname, String lastname, String email, String telephone, String address1,
			String address2, String city, String postalcode, String country, String state, String password,
			String confirmpassword) {
		// for demonstration
		// genericMethods.getElement("login", "id");
		// loginPOM.sendUserName(userName);
		// loginPOM.sendPassword(password);
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
		retailPOM.enterPinCode(postalcode);
		retailPOM.selectCountry();
		retailPOM.selectState();
		retailPOM.enterPassword(password);
		retailPOM.confirmPassword(confirmpassword);
		retailPOM.selectNoRadioBtn();
		retailPOM.checkCheckBox();
		retailPOM.continueButton();
		retailPOM.verifyTheMessage();
		screenShot.captureScreenShot("Registered user details stored in database");

	}

}