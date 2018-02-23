package com.hackathon.hw.core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionDriver {
	
	public WebDriver driver;
	
	public ActionDriver(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnElem(By loc)
	{
		driver.findElement(loc).click();
	}
	
	public void typeInTextbox(By loc, String text)
	{
		driver.findElement(loc).sendKeys(text);
	}
	
	public void selectFromDropdownByVisibleTest(By loc, String text)
	{
		Select sel = new Select(driver.findElement(loc));
		sel.selectByVisibleText(text);
	}
	
	public void selectFromDropdownByIndex(By loc, int ind)
	{
		Select sel = new Select(driver.findElement(loc));
		sel.selectByIndex(ind);
	}
	
	public void pressReturnOnAndElement(By loc)
	{
		driver.findElement(loc).sendKeys(Keys.ENTER);
	}
	
	public boolean isElementVisible(By loc)
	{
		return driver.findElement(loc).isDisplayed();
	}

	
}
