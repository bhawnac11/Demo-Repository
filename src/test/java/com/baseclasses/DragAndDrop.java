package com.baseclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Dell/Downloads/Drag&Drop.html");
		WebElement sourceLocation = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		WebElement targetLocation = driver.findElement(By.xpath("//div[text()='Drop Here']"));
		
		Actions mouse=new Actions(driver);
		mouse.clickAndHold(sourceLocation).moveToElement(targetLocation).release().build().perform();
		WebElement display = driver.findElement(By.xpath("//div[text()='Dropped!']"));
		String text = display.getText();
		System.out.println(text);
		//mouse.dragAndDrop(sourceLocation,targetLocation).perform();
		

	}

}
