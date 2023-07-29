package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frameconcepts {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
        ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame(0);
		
		String text=driver.findElement(By.id("nseindex")).getText();

		System.out.println(text);
		
		String text1=driver.findElement(By.id("bseindex")).getText();
		
		System.out.println(text1);
	}

}
