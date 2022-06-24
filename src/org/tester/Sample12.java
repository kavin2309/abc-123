package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver z = new FirefoxDriver();
		
		z.get("https://www.shopclues.com/wholesale.html");
		
		WebElement z1 = z.findElement(By.id("autocomplete"));
		
		z1.sendKeys("watches");
		
		WebElement z2 = z.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		
		z2.click();
		
		WebElement z3 = z.findElement(By.id("det_img_108490670"));
		
		z3.click();
	}
}
