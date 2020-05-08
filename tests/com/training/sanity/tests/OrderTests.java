package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.OrderLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class OrderTests {

	private WebDriver driver;
	private String baseUrl;
	private OrderLoginPOM orderPOM;
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
		orderPOM = new OrderLoginPOM(driver);
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
		orderPOM.sendUserName("admin");
		orderPOM.sendPassword("admin@123");
		orderPOM.clickLoginBtn(); 
		orderPOM.salesMenu();
		orderPOM.ClickOnOrdersLnk();
		orderPOM.enterOrderDetails("359");
		orderPOM.clickOrderFilter();
		orderPOM.enterCustomerName("Sree");
		orderPOM.clickCustFilter();
		screenShot.captureScreenShot("First");
	}
}
