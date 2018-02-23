package com.hackathon.hw.pageobjects;

import org.openqa.selenium.WebDriver;

import com.hackathon.hw.core.ActionDriver;
import com.hackathon.hw.pageelements.HomePageElements;

public class HomePage extends ActionDriver{
	
	HomePageElements hpe = null;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		hpe = new HomePageElements();
	}
	
	public void clickMoviesLink()
	{
		clickOnElem(hpe.LINK_MOVIE);
	}

}
