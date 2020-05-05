package com.myntra.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.base.Testbase;

public class HomePage extends Testbase {
	@FindBy(xpath = "//div[@data-index=\"4\"]")
	WebElement essentls;
	@FindBy(xpath = "//a[@data-reactid=\"611\"]")
	WebElement masks;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void validateHome() {
		String actual = driver.getTitle();
		String expected = "xyz.com";

		if (actual.equals(expected)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public void select() {
		Actions act = new Actions(driver);
		act.moveToElement(essentls);
		masks.click();
	}

}
