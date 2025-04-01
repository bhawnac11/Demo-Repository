package com.baseclasses;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class Practice{
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.iqvia.com/");
		Actions action=new Actions(driver);
	WebElement mouseover=driver.findElement(By.xpath("//ol[@class='primary-nav w-100']//a[text()='Solutions']"));
	action.moveToElement(mouseover).perform();
	WebElement quickfind=driver.findElement(By.xpath("//span[text()='quick find a capability']"));
	action.click(quickfind).perform();
	//WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Type a keyword, a solution or product name?']"));
	//action.click(searchbox).perform();
	
	
	}
}
		
			
		
		