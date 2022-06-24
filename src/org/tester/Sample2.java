package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver S1 = new FirefoxDriver();
		
		S1.get("http://greenstech.in/selenium-course-content.html");
		
		
		WebElement S2 = S1.findElement(By.id("home-tab"));
		
		S2.click();
		
		WebElement S3 = S1.findElement(By.xpath("//p[contains(text(),'Velmurugan')]"));
		
		String S4 = S3.getText();
		
		System.out.println(S4);
		
	}

}
