package Fb_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Launch {
	WebDriver driver;
	
	@Test
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.manage().window().maximize(); 
	driver.get("http://203.134.202.19/btes/");

}
}
