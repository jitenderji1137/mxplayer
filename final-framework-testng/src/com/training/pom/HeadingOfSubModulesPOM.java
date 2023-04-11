package com.training.pom;
import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HeadingOfSubModulesPOM {
	private WebDriver driver; 
	public HeadingOfSubModulesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement movies; 
	
	@FindBy(xpath="//a[text()='Hindi']")
	private WebElement Hindibtn;
	
	@FindBy(xpath="//h1[text()='Hindi Movies']")
	private WebElement HHeading;
	
	

	@FindBy(xpath="//a[text()='Telugu']")
	private WebElement Telugubtn;
	
	@FindBy(xpath="//h1[text()='Telugu Movies']")
	private WebElement THeading;
	
	
	@FindBy(xpath="//a[text()='Tamil']")
	private WebElement Tamilbtn;
	
	@FindBy(xpath="//h1[text()='Tamil Movies']")
	private WebElement TAHeading;
	
	
	@FindBy(xpath="//a[text()='Bhojpuri']")
	private WebElement Bhojpuribtn;
	
	@FindBy(xpath="//h1[text()='Bhojpuri Movies']")
	private WebElement BHeading;
	
	@FindBy(xpath="//a[text()='Malayalam']")
	private WebElement Malayalambtn;
	
	@FindBy(xpath="//h1[text()='Malayalam Movies']")
	private WebElement MHeading;
	public void Heading_Of_SubModules() {
		Actions act = new Actions(this.driver);
		act.moveToElement(this.movies).build().perform();;
		this.Hindibtn.click();
		String Text1 = this.HHeading.getText();
		Assert.assertEquals(Text1, "Hindi Movies");
		System.out.println(Text1);
		
		act.moveToElement(this.movies).build().perform();;
		this.Telugubtn.click();
		String Text2 = this.THeading.getText();
		Assert.assertEquals(Text2, "Telugu Movies");
		System.out.println(Text2);
		
		act.moveToElement(this.movies).build().perform();;
		this.Tamilbtn.click();
		String Text3 = this.TAHeading.getText();
		Assert.assertEquals(Text3, "Tamil Movies");
		System.out.println(Text3);
		
		act.moveToElement(this.movies).build().perform();;
		this.Bhojpuribtn.click();
		String Text4 = this.BHeading.getText();
		Assert.assertEquals(Text4, "Bhojpuri Movies");
		System.out.println(Text4);
		
		act.moveToElement(this.movies).build().perform();;
		this.Malayalambtn.click();
		String Text5 = this.MHeading.getText();
		Assert.assertEquals(Text5, "Malayalam Movies");
		System.out.println(Text5);
		System.out.println("TC_219 has passed");
	}
}
