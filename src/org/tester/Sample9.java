package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saran\\eclipse-workspace\\Selineum(Day4)\\drivers\\geckodriver.exe");
		
		WebDriver t = new FirefoxDriver();
		
		t.get("https://www.snapdeal.com");
		
		WebElement t1 = t.findElement(By.id("inputValEnter"));
		
		t1.sendKeys("Realme 5pro mobiles");
		
		WebElement t2 = t.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		
		t2.click();
		
		WebElement t3 = t.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		
		t3.click();
		
		
	}
}
