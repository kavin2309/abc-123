package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver y = new FirefoxDriver();
		
		y.get("https://www.flipkart.com");
		
		WebElement y1 = y.findElement(By.xpath("//input[@type='text']"));
		
		y1.sendKeys("OPPO F17 Pro Mobiles");
		
		WebElement y2 = y.findElement(By.xpath("(//div[@class=''])[1]"));
		
		Thread.sleep(3000);
		
		y2.click();
		
		
	}
}
