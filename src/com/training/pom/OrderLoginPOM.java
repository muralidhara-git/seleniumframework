package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderLoginPOM {
	private WebDriver driver;

	public OrderLoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-username")
	private WebElement userName;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(css = "button.btn.btn-primary")
	private WebElement loginBtn;

	@FindBy(xpath = "//i[@class='fa fa-shopping-cart fw']")
	private WebElement salesMouseOver;

	public void salesMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(salesMouseOver).build().perform();
	}

	@FindBy(xpath = "//*[@id=\"menu-sale\"]/ul/li[1]/a")
	private WebElement orderLnk;

	@FindBy(id = "input-order-id")
	private WebElement enterOrderID;

	@FindBy(id = "button-filter")
	private WebElement clkFiltr1;

	@FindBy(id = "input-customer")
	private WebElement enterCustmer;

	@FindBy(id = "button-filter")
	private WebElement clkFiltr2;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	public void ClickOnOrdersLnk() {
		this.orderLnk.click();
	}
	public void enterOrderDetails(String orderid) {
		this.enterOrderDetails(orderid);
	}
	

	public void clickOrderFilter() {
		this.clickOrderFilter();

	}

	public void enterCustomerName(String custmername) {
		this.enterCustomerName(custmername);
	}

	public void clickCustFilter() {
		this.clickCustFilter();
	}

}
