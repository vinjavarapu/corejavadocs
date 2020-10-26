package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class GoogleSearchTest extends BaseClass {
	
      
	
	@Test(priority=1)
	public void Googlesearch() throws InterruptedException  {
		
		
	   driver.findElement(By.name("q")).sendKeys("Ravikumar Vinjavarapu",Keys.RETURN);
	   Thread.sleep(5000);
		
		
	}
	

}
