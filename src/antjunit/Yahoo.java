package antjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Yahoo
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
		public void test1() 
		{
			driver.get("https://www.yahoo.com");
			System.out.println(driver.getTitle());
		}

}
