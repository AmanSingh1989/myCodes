package com.gmail.selenuim.mytest.pages.test; 

import org.openqa.selenium.support.PageFactory; 
import org.testng.annotations.Test;

import com.gmail.selenuim.mytest.base.TestBase;
//import com.gmail.selenuim.mytest.pages.GmailHomePage; 
import com.gmail.selenuim.mytest.pages.GmailLoginPage; 

public class GmailLoginTest extends TestBase { 

	@Test
	public void init() throws Exception { 

		// driver.get("https:// www.gmail.com"); 
		GmailLoginPage loginpage = 
		new GmailLoginPage(driver); 
	
		loginpage.setEmail("aman.singh1493@gmail.com"); 
		loginpage.clickOnNextButton(); 
		loginpage.setPassword("@m@n113114"); 
		loginpage.clickOnNextButton(); 
	} 
} 
