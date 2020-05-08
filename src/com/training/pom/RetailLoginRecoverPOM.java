package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailLoginRecoverPOM {
	private WebDriver driver;

	public RetailLoginRecoverPOM(WebDriver driver) {
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

	@FindBy(linkText = "Forgotten Password")
	private WebElement forgotLnk;

	@FindBy(name = "email")
	private WebElement emailAddressLnk;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clkContinueBtn;
	
	public void ClkLoginRegister() {
		this.loginRegClk.click();
	}

	public void sendEmailAddress(String emailaddress) {
		this.emailAddress.sendKeys(emailaddress);
	}

	public void sendPassword(String password) {
		this.password.sendKeys(password);
	}

	public void forgotPasswordLink() {
		this.forgotLnk.click();
	}

	public void recoverEmailAddress(String recoveremailaddress) {
		this.emailAddress.sendKeys(recoveremailaddress);
	}

	public void clickLoginBtn() {
		this.clkContinueBtn.click();
	}
}
