package com.baseclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.iqvia.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.cssSelector("span.tile")).click();
        //driver.findElement(By.className("color-white")).click();
        driver.get("file:///D:/SELENIUM/File%20Upload%20and%20Download/FileUploadAndDownload.html");
       WebElement ele =  driver.findElement(By.xpath("//input[@type='file']"));
       ele.sendKeys("D:\\Method and Functions");
       WebElement upload =  driver.findElement(By.xpath("//button[text()='Upload']"));
        upload.click();
       
       
		
	
	
	}

}
