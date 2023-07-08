package RestAssuredAutomation.RestAp;

import java.io.*;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LaunchingTheBrowser {
	WebDriver driver;

	@Test
	public void LaunchBrowser() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Prashanthchigarer\\eclipse-workspace\\RestAp\\config.properties");
		Properties pop = new Properties();
		pop.load(fis);
		String browserName = pop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edgedriver")) {
			driver = new EdgeDriver();
		}
	}
}
