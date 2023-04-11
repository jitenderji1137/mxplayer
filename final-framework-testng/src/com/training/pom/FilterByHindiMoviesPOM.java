package com.training.pom;
import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FilterByHindiMoviesPOM {
	private WebDriver driver; 
	public FilterByHindiMoviesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement movies; 
	
	@FindBy(xpath="//a[text()='Hindi']")
	private WebElement Hindibtn;
	
	@FindBy(xpath="//h1[text()='Hindi Movies']")
	private WebElement Heading;
	public void Filter_By_Hindi_Movies() {
		Actions act = new Actions(this.driver);
		act.moveToElement(this.movies).build().perform();;
		this.Hindibtn.click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.mxplayer.in/movie-videos/hindi-movies");
		String Text = this.Heading.getText();
		Assert.assertEquals(Text, "Hindi Movies");
		System.out.println(Text);
		System.out.println("TC_219 has passed");
	}
}
