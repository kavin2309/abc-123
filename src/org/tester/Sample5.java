package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample5 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver A1 = new FirefoxDriver();
		
		A1.get(" http://www.greenstechnologys.com/");

		WebElement A2 = A1.findElement(By.xpath("//font[contains(text(),'Greens Technology')]"));
		
		String A3 = A2.getText();
		
		System.out.println(A3);
		
	}

}
