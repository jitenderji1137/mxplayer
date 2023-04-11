package com.training.pom;
import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VisibilityOfAllSubmodulesPOM {
	private WebDriver driver; 
	public VisibilityOfAllSubmodulesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='movies'])[1]")
	private WebElement movies; 
	
	@FindBy(css =".ht_item")
	private List<WebElement> submodule;
	
	public void Visibility_Of_AllSubmodules() {
		Actions act = new Actions(this.driver);
		act.moveToElement(this.movies).build().perform();;
		int Len = this.submodule.size();
		Assert.assertEquals(Len, 10);
		System.out.println(Len);
		System.out.println("TC_222 has passed");
	}
}
