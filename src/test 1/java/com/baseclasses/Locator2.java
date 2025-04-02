package com.baseclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator2 {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.className("nav-a")).click();
		driver.findElement(By.id("irygsh-gc5542-7w8bat-w7je06")).click();
		driver.findElement(By.cssSelector("a.nav-a")).click();
		driver.findElement(By.cssSelector("a#nav_cs_1")).click();
		driver.findElement(By.cssSelector("a[tabindex='0']")).click();
		String text= driver.findElement(By.tagName("h1")).getText();
		
		
		
		
		
	}
	

}
