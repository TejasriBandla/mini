package com.myntra.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.base.Testbase;

public class LoginPage extends Testbase  {
	@FindBy(id = "mobileNumberPass")
	WebElement skp;
	@FindBy(className = "form-control")
	WebElement email;
	@FindBy(className = "form-control has-feedback")
	WebElement pwd;
	@FindBy(className = "btn primary  lg block submitButton")
	WebElement lgin;
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	//actions
	
	public HomePage login(String mail, String pass) {
		skp.clear();
	email.sendKeys(mail);	
	pwd.sendKeys(pass);
	lgin.click();
	return new HomePage();
}
}