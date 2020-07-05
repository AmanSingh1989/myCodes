package com.gmail.selenuim.mytest.pages.test; 

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gmail.selenuim.mytest.base.TestBase;
//import com.gmail.selenuim.mytest.pages.GmailHomePage; 
import com.gmail.selenuim.mytest.pages.GmailLoginPage; 

public class GmailLoginTest extends TestBase { 

	@Test
	public void init() throws Exception { 

		// driver.get("https:// www.gmail.com"); 
		GmailLoginPage loginpage = new GmailLoginPage(driver);
		
		loginpage.setEmail(""); 
		loginpage.clickOnNextButton(); 
		
		//login.
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=password]")));
	    
		loginpage.setPassword(""); 
		loginpage.clickOnNextButton(); 
	} 
} 
