package com.selenium.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		
		driver.manage().window().maximize();
		

		WebElement txtbox = driver.findElement(By.name("wd"));
		txtbox.sendKeys("helloworld");
		
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		
		driver.close();
		
	}

}
