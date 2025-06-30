package Testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aboutus {

	@Test 
	public void verifyhomepage () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		Thread.sleep(300);
		String getAboutPageTitle = driver.getTitle();
			System.out.println(getAboutPageTitle);
			
		if(getAboutPageTitle.equals("About Us | Puneri Pattern"))
			System.out.println("TC Cases pass");
	 else {
		  System.out.println("TC cases failed");
		 }
	
	driver.close ();
	
	}
}
