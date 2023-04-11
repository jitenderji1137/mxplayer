package com.training.pom;
import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FilterByGeansPOM {
	private WebDriver driver; 
	public FilterByGeansPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement movies; 
	
	@FindBy(xpath="//a[text()='Hindi']")
	private WebElement Hindibtn;
	
	@FindBy(xpath="//h1[text()='Hindi Movies']")
	private WebElement Heading;
	
	@FindBy(xpath="//div[text()='Crime']")
	private WebElement Crime;
	
	@FindBy(xpath="//h1[text()='Hindi Crime Movies']")
	private WebElement CrimeText;
	
	@FindBy(xpath="//div[@role='presentation'][text()='Romance']")
	private WebElement Romance;
	
	
	@FindBy(xpath="//h1[text()='Browse All Movies']")
	private WebElement RomanticText;
	public void Filter_By_Geans() {
		Actions act = new Actions(this.driver);
		act.moveToElement(this.movies).build().perform();;
		this.Hindibtn.click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.mxplayer.in/movie-videos/hindi-movies");
		String Text = this.Heading.getText();
		Assert.assertEquals(Text, "Hindi Movies");
		System.out.println(Text);
		this.Crime.click();
		String CText = this.CrimeText.getText();
		Assert.assertEquals(CText, "Hindi Crime Movies");
		System.out.println(CText);
		this.Romance.click();
		String RText = this.RomanticText.getText();
		Assert.assertEquals(RText, "Browse All Movies");
		System.out.println(RText);
		System.out.println("TC_223 has passed");
	}
}
