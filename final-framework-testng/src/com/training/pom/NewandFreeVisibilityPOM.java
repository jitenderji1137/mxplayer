package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewandFreeVisibilityPOM {
	private WebDriver driver; 
	
	public NewandFreeVisibilityPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-to='/new-release']")
	private WebElement newfreebtn; 
	
	public void validate_new_and_free() {
		String text = this.newfreebtn.getText();
		Assert.assertEquals(text, "New & Hot🔥");
		System.out.println(text);
		System.out.println("TC_015 has passed");
	}
}
