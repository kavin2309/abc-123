package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver q = new FirefoxDriver();
		
		q.get(" http://adactinhotelapp.com");
		
		
		WebElement q1 = q.findElement(By.id("username"));
		
		q1.sendKeys("Kavin4567");
		
		String p = q1.getAttribute("value");
		
		System.out.println(p);
		
		
		WebElement q2 = q.findElement(By.id("password"));
		
		q2.sendKeys("9876@87y");
		
		String p1 = q2.getAttribute("value");
		
		System.out.println(p1);
	}
}
