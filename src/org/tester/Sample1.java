package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver M = new FirefoxDriver();
		
		M.get("http://www.greenstechnologys.com");
		
		WebElement M1 = M.findElement(By.xpath("//u[contains(text(),'Greens')]"));
		
		String M2 = M1.getText();
		
		System.out.println(M2);
	}

}
