package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample7 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver k = new FirefoxDriver();
		
		k.get(" http://www.google.com");
		
		WebElement k1 = k.findElement(By.name("q"));
		
		k1.sendKeys("greens velmurugan");
		
		WebElement k2 = k.findElement(By.name("btnK"));
		
		k2.click();
		
		WebElement k3 = k.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		
		k3.click();
	}

}
