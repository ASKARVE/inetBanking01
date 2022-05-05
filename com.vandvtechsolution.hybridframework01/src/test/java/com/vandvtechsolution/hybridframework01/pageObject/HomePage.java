package com.vandvtechsolution.hybridframework01.pageObject;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	public static void main(String[] args){
	System.out.println("main method added");
	}
}
