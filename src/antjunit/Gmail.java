package antjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail
{
	
	   WebDriver driver;
		@Before
		public void setUp() throws Exception 
		{
			driver=new FirefoxDriver();
		}

		@After
		public void tearDown() throws Exception 
		{
			driver.quit();
		}

		@Test
		public void test() 
		{
			driver.get("https://www.gmail.com");
			System.out.println(driver.getTitle());
		}

}
