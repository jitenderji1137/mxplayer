package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MoviesButtonClickPOM {
	private WebDriver driver; 
	
	public MoviesButtonClickPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement Homebtn; 
	
	public void verifymoviesbtn() {
		Homebtn.click();
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.mxplayer.in/movies");
		System.out.println(URL);
		System.out.println("TC_014 has passed");
	}
}
