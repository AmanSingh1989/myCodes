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
		PageFactory.initElements(driver, 
		GmailLoginPage.class); 
	
		loginpage.setEmail("abc@gmail.com"); 
		loginpage.clickOnNextButton(); 
		loginpage.setPassword("23456@qwe"); 
		loginpage.clickOnNextButton(); 
	} 
} 
