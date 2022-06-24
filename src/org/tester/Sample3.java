package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver E1 = new FirefoxDriver();
		
		E1.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement E2 = E1.findElement(By.xpath("(//span[@class='address-align-first'])[1]"));
		String E3 = E2.getText();
		System.out.println(E3);
		
		WebElement E4 = E1.findElement(By.xpath("(//span[@class='address-align'])[1]"));
		String E5 = E4.getText();
		System.out.println(E5);
		
		WebElement E6 = E1.findElement(By.xpath("(//span[@class='address-align'])[2]"));
		String E7 = E6.getText();
		System.out.println(E7);
		
		WebElement E8 = E1.findElement(By.xpath("(//span[@class='address-align'])[3]"));
		String E9 = E8.getText();
		System.out.println(E9);
		
		WebElement E10 = E1.findElement(By.xpath("(//span[@class='address-align'])[4]"));
		String E11 = E10.getText();
		System.out.println(E11);
		
		WebElement E12 = E1.findElement(By.xpath("(//a[@title='+91-9944152058'])[3]"));
		String E13 = E12.getText();
		System.out.println(E13);
		
		WebElement E14 = E1.findElement(By.xpath("(//a[@title='greenstechnologyomrleads@gmail.com'])[1]"));
		String E15 = E14.getText();
		System.out.println(E15);
		
		
		
				
		
		
		
		
		
		
		
	}

}
