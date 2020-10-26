package com.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.google.common.io.Files;


@Test
public class Screenshot {
	
	public void CaptureScreenshot() 
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\sel-selenium\\chromedriver_win32 (10)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
		
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("ragini"); 
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		Fileutils.copyFile(source,new File("C:\\Users\\admin\\eclipse-workspace\\FirstJavaProject\\Screenshot\\facebook.png"));
		
		System.out.println("Screenshot taken");
		
		driver.quit();
		
		
		
		
	}

}
