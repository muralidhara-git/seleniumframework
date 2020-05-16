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

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginMultipleValuesTest {
	private WebDriver driver;
	private String baseUrl;
//	private String adminUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] { { "manzoor@gmail.com", "123456" }, { "manzoor", "manzoor" }, { "manzoor", "mehadi" },
				{ "manz1", "manz1" } };
	}

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
//		adminUrl = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
//		driver.get(adminUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(priority = 1, dataProvider = "inputs" , enabled = true)
	public void loginUsingDataProvider(String userName, String password) {
		loginPOM.accntClk();
		loginPOM.ClkLoginRegister();
		loginPOM.sendEmailAddress(userName);
		loginPOM.enterPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}

	@Test(priority = 2, enabled = true )
	public void chkOutPreLogin() throws Exception {
		loginPOM.srchProductText();
		loginPOM.srchProdClk();
		loginPOM.clkOnProdSrch();
		loginPOM.clkonAddCart();
		loginPOM.mousehovercart();
		loginPOM.viewCartClk();
		loginPOM.clkChkOutButton();
		screenShot.captureScreenShot("Checking Out Without Pre-Logging In");
	}

	@Test(priority = 3, enabled = true )
	public void registerdplaceAnOrder() throws Exception {
		loginPOM.srchProductText();
		loginPOM.srchProdClk();
		loginPOM.clkOnProdSrch();
		loginPOM.clkonAddCart();
		loginPOM.mousehovercart();
		loginPOM.viewCartClk();
		loginPOM.clkChkOutButton();
		loginPOM.sendEmailAddress("test009@gmail.com");
		loginPOM.enterPassword("password1");
		loginPOM.clickLoginBtn();
		loginPOM.paymentButtonClk();
		loginPOM.shippingContinueButtonClk();
		loginPOM.verifyFreeShipRadioBtn();
		loginPOM.enterText();
		loginPOM.shippingMethodBtnClk();
		loginPOM.clkTermsAndConditionChkBox();
		Thread.sleep(3000);
		loginPOM.paymentMethodBtnClk();
		loginPOM.confirmationProduct();
		loginPOM.confrmOrderButtonClk();
		loginPOM.successmessage();
		screenShot.captureScreenShot("Successful Place an Order");
	}

	@Test(priority = 4 , enabled = true )
	public void guestplaceAnOrder() throws Exception {
		loginPOM.srchProductText();
		loginPOM.srchProdClk();
		loginPOM.clkOnProdSrch();
		loginPOM.clkonAddCart();
		loginPOM.mousehovercart();
		loginPOM.viewCartClk();
		loginPOM.clkChkOutButton();
		loginPOM.guestUserSelection();
		loginPOM.contClkBtn();
		loginPOM.clickLoginBtn();
		loginPOM.enterFirstName("TestO1");
		loginPOM.enterLastName("Order");
		loginPOM.enterEmail("guestuser@test.com");
		loginPOM.enterPhone("0823123111");
		loginPOM.enteraddress1("Vijayanagar");
		loginPOM.enteraddress2("bangalore");
		loginPOM.entercity("bangalore");
		loginPOM.enterPostal("123457");
		loginPOM.countrySelection();
		loginPOM.regionSelection();
		loginPOM.clkOnGuestBtn();
		loginPOM.verifyRadioButton();
		loginPOM.enterComments("This product is nice");
		loginPOM.shippingMethodBtnClk();
		loginPOM.acceptTrmsAndCondn();
		Thread.sleep(3000);
		loginPOM.paymentMethodBtnClk();
		loginPOM.confirmationProduct();
		loginPOM.confrmOrderButtonClk();
		loginPOM.successmessage();
		screenShot.captureScreenShot("Guest user successful Place an Order");
	}
	@Test(priority = 5 ,enabled = false )
	public void addNewProdWithDiscount() throws Exception {
		loginPOM.adminUserName("admin");
		loginPOM.adminPassword("admin@123");
		loginPOM.clickAdminLoginButton();
		loginPOM.ProdcutMouseHover();
		loginPOM.clickProductCatgegory();
		loginPOM.clkAddNew();
		loginPOM.enterPorductName("Finger Ring");
		loginPOM.enterTitleName("Finger Ring Ladies");
		loginPOM.ClkOnDataTab();
		loginPOM.enterModelName("SKU-012");
		loginPOM.enterQuantity("500");
		loginPOM.clkOnLinkTab();
		loginPOM.enterCatgeory("Finger Ring");
		loginPOM.clkOnDiscountTab();
		loginPOM.addDiscount();
		loginPOM.enterDiscountQty("1");
		loginPOM.enterDiscountPrice("50");
		loginPOM.selectStartDate();
		Thread.sleep(3000);
		loginPOM.selectEndDate();
		loginPOM.clkOnRewardPointTab();
		loginPOM.clickSaveBtn();
		screenShot.captureScreenShot("Add Product");
		
	}	
		
		
}