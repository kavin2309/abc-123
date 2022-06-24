package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample6 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver E1 = new FirefoxDriver();
		
		E1.get("https://www.facebook.com");
		
		WebElement E2 = E1.findElement(By.id("email"));
		
		E2.sendKeys("Kavin8786");
		
		String S = E2.getAttribute("value");
		System.out.println(S);
		
		
		WebElement E3 = E1.findElement(By.id("pass"));
		
		E3.sendKeys("123@jkm&");
		
		String S1 = E3.getAttribute("value");
		
		System.out.println(S1);
		
		

	}

}
