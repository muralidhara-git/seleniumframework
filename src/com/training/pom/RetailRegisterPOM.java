package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RetailRegisterPOM {
	private WebDriver driver;

	public RetailRegisterPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Test Case 1
	@FindBy(css = "i.fa.fa-user-o")
	private WebElement accountLink;

	public void accntClk() {
		Actions action = new Actions(driver);
		action.moveToElement(accountLink).build().perform();
	}

	@FindBy(xpath = "//span[contains(text(),'LOGIN / REGISTER')]")
	private WebElement loginRegClk;

	@FindBy(css = "a.btn.btn-primary")
	private WebElement registerClk;

	@FindBy(id = "input-firstname")
	private WebElement entrFirstName;

	@FindBy(id = "input-lastname")
	private WebElement entrLastName;

	@FindBy(name = "email")
	private WebElement entrEmail;

	@FindBy(id = "input-telephone")
	private WebElement entrTelPhone;

	@FindBy(id = "input-address-1")
	private WebElement address1;

	@FindBy(id = "input-address-2")
	private WebElement address2;

	@FindBy(id = "input-city")
	private WebElement cityDetails;

	@FindBy(id = "input-postcode")
	private WebElement pinCode;

	@FindBy(id = "input-country")
	private WebElement countryList;

	public void selectCountry() {
		Select selectCountry = new Select(countryList);
		selectCountry.selectByVisibleText("India");
	}

	@FindBy(xpath = "//select[@id='input-zone']")
	private WebElement regionState;

	public void selectState() {
		Select selectState = new Select(regionState);
		selectState.selectByVisibleText("Karnataka");
	}

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswd;

	@FindBy(xpath = "//input[@value='0']")
	private WebElement noRadioselect;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chkCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clkContinue;

	@FindBy(xpath = "//div[@class='tb_text_wrap tb_sep']")
	private WebElement verifyMessage;

	// Test Case 2
	@FindBy(id = "input-email")
	private WebElement emailAddress;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;

	// Test Case 3

	@FindBy(linkText = "Forgotten Password")
	private WebElement forgotLnk;

	@FindBy(name = "email")
	private WebElement emailAddressLnk;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clkContinueBtn;

	// Test case 4

	@FindBy(xpath = "//input[@id='filter_keyword']")
	private WebElement srchProduct;

	@FindBy(xpath = "//a[@id='search_button']")
	private WebElement clkProdSrch;

	@FindBy(xpath = "//a[contains(text(),'Integer Vitae Iaculis Massa')]")
	private WebElement clkOnProd;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clkAddonCart;
	

	@FindBy(css = "i.tb_icon.ico-linea-ecommerce-bag")
	private WebElement hoverCart;

	public void mousehovercart() {
		Actions action = new Actions(driver);
		action.moveToElement(hoverCart).build().perform();
	}

	@FindBy(xpath = "//a[contains(text(),'View Cart')]")
	private WebElement viewCart;

	@FindBy(css = "a.btn.btn-primary")
	private WebElement chkOutbtn;

	// Test Case 1
	public void ClkLoginRegister() {
		this.loginRegClk.click();
	}

	public void registerClick() {
		this.registerClk.click();
	}

	public void enterFName(String firstname) {
		this.entrFirstName.sendKeys(firstname);
	}

	public void enterLName(String lastname) {
		this.entrLastName.sendKeys(lastname);
	}

	public void enterEmail(String enteremail) {
		this.entrEmail.sendKeys(enteremail);
	}

	public void enterTPhone(String phone) {
		this.entrTelPhone.sendKeys(phone);
	}

	public void enterAddress1(String addressone) {
		this.address1.sendKeys(addressone);
	}

	public void enterAddress2(String addresstwo) {
		this.address2.sendKeys(addresstwo);
	}

	public void enterCity(String city) {
		this.cityDetails.sendKeys(city);

	}

	public void enterPinCode(String pincode) {
		this.pinCode.sendKeys(pincode);
	}

	public void selctContry(String country) {
		this.selectCountry();
	}

	public void selctState(String state) {
		this.selectState();
	}

	public void enterPassword(String pass) {
		this.password.sendKeys(pass);

	}

	public void confirmPassword(String cpass) {
		this.confirmPasswd.sendKeys(cpass);

	}

	public void selectNoRadioBtn() {
		this.noRadioselect.click();
	}

	public void checkCheckBox() {
		this.chkCheckBox.click();
	}

	public void continueButton() {
		this.clkContinue.click();
	}

	public void verifyTheMessage() {
		String message = verifyMessage.getText();
		System.out.println(message);
	}

	// Test Case 2
	public void sendEmailAddress(String emailaddress) {
		this.emailAddress.sendKeys(emailaddress);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Test Case 3
	public void forgotPasswordLink() {
		this.forgotLnk.click();
	}

	public void recoverEmailAddress(String recoveremailaddress) {
		this.emailAddress.sendKeys(recoveremailaddress);
	}

	public void clickContinue() {
		this.clkContinueBtn.click();
	}

	// Test case 4
	public void srchProductText() {
		this.srchProduct.sendKeys("Integer Vitae Iaculis Massa");
	}

	public void srchProdClk() {
		this.clkProdSrch.click();
	}

	public void clkOnProdSrch() {
		this.clkOnProd.click();
	}

	public void clkonAddCart() throws Exception {
		this.clkAddonCart.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
		
		

}
	public void viewCartClk() {
		this.viewCart.click();
	}

	public void clkChkOutButton() {
		this.chkOutbtn.click();
	}

}
