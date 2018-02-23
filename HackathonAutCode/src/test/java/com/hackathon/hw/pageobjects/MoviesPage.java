package com.hackathon.hw.pageobjects;

import org.openqa.selenium.WebDriver;

import com.hackathon.hw.core.ActionDriver;
import com.hackathon.hw.pageelements.HomePageElements;
import com.hackathon.hw.pageelements.MoviesPageElements;

public class MoviesPage extends ActionDriver{
	
	MoviesPageElements mpe = null;
	
	public MoviesPage(WebDriver driver)
	{
		super(driver);
		mpe = new MoviesPageElements();
	}
	
	public void selectLanguageAsHindi()
	{
		clickOnElem(mpe.DROPDOWN_LANGUAGE);
		clickOnElem(mpe.LIST_LANGUAGES_HINDI);
	}
	
	
	public void enterACity(String text)
	{
		typeInTextbox(mpe.TEXTBOX_CITY_ON_POPUP, text);
		pressReturnOnAndElement(mpe.TEXTBOX_CITY_ON_POPUP);
	}
	
	public boolean isLanguageDropdownVisible()
	{
		return isElementVisible(mpe.DROPDOWN_LANGUAGE);
	}
	
	

}
