package com.hackathon.hw.pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hackathon.hw.core.BrowserOperations;
import com.hackathon.hw.pageobjects.HomePage;
import com.hackathon.hw.pageobjects.MoviesPage;

public class BookMyMovieTestSet1 extends BrowserOperations{
	
HomePage homePage = null;
MoviesPage moviesPage = null;
	

	
	@Test
	public void bookMyMovieTest1()
	{
		homePage = new HomePage(driver);
		homePage.clickMoviesLink();
		
		moviesPage = new MoviesPage(driver);
		moviesPage.enterACity("Bangalore");
		
		Boolean flag = moviesPage.isLanguageDropdownVisible();
		Assert.assertTrue(flag);
		
		moviesPage.selectLanguageAsHindi();
		
		
		
	}
	

}
