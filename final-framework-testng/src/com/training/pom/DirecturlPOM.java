package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DirecturlPOM {
	private WebDriver driver; 
	
	public DirecturlPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement Homebtn; 
	

	public void DirectURL() {
		this.driver.get("https://www.mxplayer.in/");
		String text = this.Homebtn.getText();
		Assert.assertEquals(text, "Movies");
		System.out.println(text);
		System.out.println("TC_224 has passed");
	}
}
