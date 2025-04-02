package com.baseclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class MouseInteractions {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.get("https://www.iqvia.com/");

//WebElement ele = driver.findElement(By.xpath("(//a[@class='color-white'])[4]"));
//WebElement quickClick = driver.findElement(By.xpath("//a[text()='IQVIA Connected Intelligence™']"));
//WebElement rightClick = driver.findElement(By.xpath("//ol[@class='primary-nav w-100']//a[text()='Solutions']"));
//Actions mouse = new Actions(driver);
//mouse.moveToElement(ele).click(quickClick).perform();
//contextClick(rightClick).perform();
//mouse.contextClick(rightClick).perform();
class MouseInteractions{
public static void main(String[]args){
	//practice

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("URL");
WebElement mouseMove = driver.findElement(By.xpath(""));
Actions mouseOver = new Actions(driver);
mouseOver.click();








}






	}


