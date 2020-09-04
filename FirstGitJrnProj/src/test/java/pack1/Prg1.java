package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Prg1 {
@Test
	public void google() {
		// TODO Auto-generated method stub
		System.out.println("Browser opening....");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinod Khandekar\\Desktop\\SeleniumJars\\geckodriver.exe");
		
		
		WebDriver w = new FirefoxDriver();
		w.get("https://www.google.com/");
		System.out.println("Google opened.....");
		w.quit();
		System.out.println("browser closed.....");
	}

}
