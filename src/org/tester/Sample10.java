package org.tester;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample10 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver x = new FirefoxDriver();
		
		x.get("https://www.flipkart.com");
		
		x.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8825599261");
		
		x.findElement(By.xpath("//input[@type='password']")).sendKeys("A8825599261a@");
		
		x.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		Thread.sleep(5000);
		
		x.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi Mobiles");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		x.findElement(By.xpath("//div[text()='REDMI 10 (Caribbean Green, 64 GB)']")).click();
		
		
		
		
	}

}
