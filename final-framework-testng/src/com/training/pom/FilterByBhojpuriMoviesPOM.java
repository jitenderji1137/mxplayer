package com.training.pom;
import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FilterByBhojpuriMoviesPOM {
	private WebDriver driver; 
	public FilterByBhojpuriMoviesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement movies; 
	
	@FindBy(xpath="//a[text()='Bhojpuri']")
	private WebElement Bhojpuribtn;
	
	@FindBy(xpath="//h1[text()='Bhojpuri Movies']")
	private WebElement Heading;
	public void Filter_By_Bhojpuri_Movies() {
		Actions act = new Actions(this.driver);
		act.moveToElement(this.movies).build().perform();;
		this.Bhojpuribtn.click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.mxplayer.in/movie-videos/bhojpuri-movies");
		String Text = this.Heading.getText();
		Assert.assertEquals(Text, "Bhojpuri Movies");
		System.out.println(Text);
		System.out.println("TC_217 has passed");
	}
}
