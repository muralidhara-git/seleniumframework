package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class LoginPOM {

	private WebDriver driver;

	public LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "i.fa.fa-user-o")
	private WebElement accountLink;

	
	@FindBy(xpath = "//span[contains(text(),'LOGIN / REGISTER')]")
	private WebElement loginRegClk;

	@FindBy(id = "input-email")
	private WebElement emailAddress;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;

	public void ClkLoginRegister() {
		this.loginRegClk.click();
	}

	// Test Case 2
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

	@FindBy(xpath = "//a[contains(text(),'View Cart')]")
	private WebElement viewCart;

	@FindBy(css = "a.btn.btn-primary")
	private WebElement chkOutbtn;

	// Test Case 3
	@FindBy(id = "button-payment-address")
	private WebElement paymentContinueBtn;

	@FindBy(id = "button-shipping-address")
	private WebElement shippingContinueBtn;

	@FindBy(xpath = "//input[@name='shipping_method']")
	private WebElement freeShipRadioBtn;

	@FindBy(xpath = "//textarea[@name='comment']")
	private WebElement commentsText;

	@FindBy(id = "button-shipping-method")
	private WebElement shippingMethodClk;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement termsAndCondChkBox;

	@FindBy(id = "button-payment-method")
	private WebElement paymentShippingBtnMethod;

	@FindBy(css = "div.table-responsive")
	private WebElement prodConfrmPage;

	@FindBy(id = "button-confirm")
	private WebElement confrmOrderBtn;

	@FindBy(css = "div.tb_text_wrap.tb_sep")
	private WebElement successMessage;

	// Test Case 4
	@FindBy(xpath = "//input[@value='guest']")
	private WebElement guestUser;

	@FindBy(id = "button-account")
	private WebElement contClkbtn;

	@FindBy(id = "input-payment-firstname")
	private WebElement firstname;

	@FindBy(id = "input-payment-lastname")
	private WebElement lastname;

	@FindBy(id = "input-payment-email")
	private WebElement email;

	@FindBy(id = "input-payment-telephone")
	private WebElement telePhone;

	@FindBy(id = "input-payment-address-1")
	private WebElement address1;

	@FindBy(id = "input-payment-address-2")
	private WebElement address2;

	@FindBy(id = "input-payment-city")
	private WebElement city;

	@FindBy(id = "input-payment-postcode")
	private WebElement postalCode;

	@FindBy(id = "input-payment-country")
	private WebElement selectCountry;
	
	@FindBy(id = "input-payment-zone")
	private WebElement selectRegion;

	@FindBy(xpath = "//input[@name='shipping_address']")
	private WebElement selectDeliveryChkBox;

	@FindBy(id = "button-guest")
	private WebElement clkGuestBtn;

	@FindBy(xpath = "//input[@name='shipping_method']")
	private WebElement verifyRadioBtn;

	@FindBy(css = "textarea.form-control")
	private WebElement enterTxt;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement acceptTermsAndCondition;

	@FindBy(css = "div.table-responsive")
	private WebElement verifyConfrmOrderDetails;

	@FindBy(id = "button-confirm")
	private WebElement clkConfirmOrderBtn;

	// Test Case 5
	@FindBy(id = "input-username")
	private WebElement enterAdminUserName;

	@FindBy(id = "input-password")
	private WebElement enterAdminPassword;

	@FindBy(css = "button.btn.btn-primary")
	private WebElement clkAdminLoginBtn;

	@FindBy(css = "i.fa.fa-tags.fw")
	private WebElement MousehoverCategory;


	@FindBy(xpath = "//li[@id='menu-catalog']/ul/li[2]/a")
	private WebElement clkProductLnk;

	@FindBy(css = "a.btn.btn-primary")
	private WebElement addNewIcon;

	@FindBy(id = "input-name1")
	private WebElement enterProdNameInGenTab;

	@FindBy(id = "input-meta-title1")
	private WebElement enterTitleInGenTab;

	@FindBy(xpath = "//a[contains(text(),'Data')]")
	private WebElement clkDataTab;

	@FindBy(id = "input-model")
	private WebElement enterModel;

	@FindBy(id = "input-price")
	private WebElement enterPrice;

	@FindBy(id = "input-quantity")
	private WebElement enterQuantity;

	@FindBy(xpath = "//a[contains(text(),'Links')]")
	private WebElement clkLinkTab;

	@FindBy(id = "input-category")
	private WebElement enterCategory;

	@FindBy(xpath = "//a[contains(text(),'Discount')]")
	private WebElement clkDiscountTab;

	@FindBy(xpath = "//table[@id='discount']/tfoot/tr/td/button ")
	private WebElement addDiscount;

	@FindBy(xpath = "//td[@class='text-right']/following::input[1]")
	private WebElement enterDisQuantity;

	@FindBy(xpath = "//td[@class='text-right']/following::input[3]")
	private WebElement enterDisPrice;

	@FindBy(xpath = "//td[@class='text-left']/div/span/button")
	private WebElement startDate;

	@FindBy(xpath = "//tr[@id='discount-row0']/td[6]/div/span/button/i")
	private WebElement endDate;

	@FindBy(xpath = "//form[@id='form-product']/ul/li[10]/a")
	private WebElement clkRewardsPntTab;

	@FindBy(id = "input-points")
	private WebElement enterRewardsPoints;

	@FindBy(xpath = "//button[@type='submit']/i")
	private WebElement clkSaveBtn;
	
	public void accntClk() {
		Actions action = new Actions(driver);
		action.moveToElement(accountLink).build().perform();
	}

	public void mousehovercart() {
		Actions action = new Actions(driver);
		action.moveToElement(hoverCart).build().perform();
	}
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
		// driver.switchTo().alert().accept();

	}

	public void viewCartClk() {
		this.viewCart.click();
	}

	public void clkChkOutButton() {
		this.chkOutbtn.click();
	}

	public void sendEmailAddress(String emailaddress) {
		this.emailAddress.sendKeys(emailaddress);
	}

	public void enterPassword(String pass) {
		this.password.sendKeys(pass);

	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Test Case 3
	public void paymentButtonClk() {
		this.paymentContinueBtn.click();
	}

	public void shippingContinueButtonClk() {
		this.shippingContinueBtn.click();
	}

	public void verifyFreeShipRadioBtn() {
		boolean verifyRadioBtn = this.freeShipRadioBtn.isSelected();
		System.out.println(" Is Free Shipping radio button selected: " + verifyRadioBtn);

	}

	public void enterText() {
		this.commentsText.sendKeys("This product is nice");
	}

	public void shippingMethodBtnClk() {
		this.shippingMethodClk.click();

	}

	public void clkTermsAndConditionChkBox() {
		this.termsAndCondChkBox.click();
	}

	public void paymentMethodBtnClk() {
		this.paymentShippingBtnMethod.click();
	}

	public void confirmationProduct() {
		this.prodConfrmPage.click();
	}

	public void confrmOrderButtonClk() {
		this.confrmOrderBtn.click();
	}

	public void successmessage() {
		String successfulOrderMessage = this.successMessage.getText();
		System.out.println("Placed Order Successful Message is : " + successfulOrderMessage);
	}

	// Test Case 4 Methods
	public void guestUserSelection() {
		this.guestUser.click();

	}

	public void contClkBtn() {
		this.contClkbtn.click();
	}

	public void enterFirstName(String firstname) {
		this.firstname.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		this.lastname.sendKeys(lastname);
	}

	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}

	public void enterPhone(String phoneno) {
		this.telePhone.sendKeys(phoneno);
	}

	public void enteraddress1(String address1) {
		this.address1.sendKeys(address1);
	}

	public void enteraddress2(String address2) {
		this.address2.sendKeys(address2);
	}

	public void entercity(String city) {
		this.city.sendKeys(city);
	}
	public void countrySelection() {
		Select select = new Select(selectCountry);
		select.selectByVisibleText("India");
	}
	public void regionSelection() {
		Select select = new Select(selectRegion);
		select.selectByVisibleText("Karnataka");
	}

	public void enterPostal(String postalcode) {
		this.postalCode.sendKeys(postalcode);
	}

	public void selectChkBox() {
		this.selectDeliveryChkBox.click();
	}

	public void clkOnGuestBtn() {
		this.clkGuestBtn.click();
	}

	public void verifyRadioButton() {
		boolean verify = this.verifyRadioBtn.isSelected();
		System.out.println(verify);
	}

	public void enterComments(String comments) {
		this.enterTxt.sendKeys(comments);
	}

	public void acceptTrmsAndCondn() {
		this.acceptTermsAndCondition.click();
	}

	public void verifyOrderDetails() {
		String orderdetails = this.verifyConfrmOrderDetails.getText();
		System.out.println(orderdetails);

	}

	public void ClkConfirmBtn() {
		this.clkConfirmOrderBtn.click();
	}

	// Test case 5
	public void adminUserName(String adminusername) {
		this.enterAdminUserName.sendKeys(adminusername);
	}

	public void adminPassword(String adminpass) {
		this.enterAdminPassword.sendKeys(adminpass);
	}

	public void clickAdminLoginButton() {
		this.clkAdminLoginBtn.click();
	}

	public void ProdcutMouseHover() {
		Actions action = new Actions(driver);
		action.moveToElement(MousehoverCategory).perform();
	}

	public void clickProductCatgegory() {
		this.clkProductLnk.click();
	}

	public void clkAddNew() {
		this.addNewIcon.click();
	}

	public void enterPorductName(String product) {
		this.enterProdNameInGenTab.sendKeys(product);
	}

	public void enterTitleName(String title) {
		this.enterTitleInGenTab.sendKeys(title);
	}

	public void ClkOnDataTab() {
		this.clkDataTab.click();
	}

	public void enterModelName(String modelname) {
		this.enterModel.sendKeys(modelname);
	}

	public void enterQuantity(String qty) {
		this.enterModel.sendKeys(qty);
	}

	public void clkOnLinkTab() {
		this.clkLinkTab.click();
	}

	public void enterCatgeory(String entrcategory) {
		this.enterCategory.sendKeys(entrcategory);
	}

	public void clkOnDiscountTab() {
		this.clkDiscountTab.click();
	}

	public void addDiscount() {
		this.addDiscount.click();
	}

	public void enterDiscountQty(String disqty) {
		this.enterDisQuantity.sendKeys(disqty);
	}

	public void enterDiscountPrice(String disprice) {
		this.enterDisPrice.sendKeys(disprice);
	}

	public void selectStartDate() {
		this.startDate.click();
	}

	public void selectEndDate() {
		this.endDate.click();
	}

	public void clkOnRewardPointTab() {
		this.clkRewardsPntTab.click();
	}

	public void clickSaveBtn() {
		this.clkSaveBtn.click();
	}

}