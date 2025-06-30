package Testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;
import org.testng.annotations.Test;

public class Homepage {
	
	@Test 
	public void verifyhomepage () {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		String getHomePageTitle = driver.getTitle();
			System.out.println(getHomePageTitle);
			
		if(getHomePageTitle.equals("Software Testing | Full Stack Development Training Hadapsar"))
			System.out.println("TC Cases pass");
	 else {
		  System.out.println("TC cases failed");
		 }
	
	driver.close ();
	
	}
}
	


