package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailLoginPOM {
	private WebDriver driver;

	public RetailLoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "i.fa.fa-user-o")
	private WebElement accountLink;

	public void accntClk() {
		Actions action = new Actions(driver);
		action.moveToElement(accountLink).build().perform();
	}

	@FindBy(xpath = "//span[contains(text(),'LOGIN')]")
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

	public void sendEmailAddress(String emailaddress) {
		this.emailAddress.sendKeys(emailaddress);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}
}
