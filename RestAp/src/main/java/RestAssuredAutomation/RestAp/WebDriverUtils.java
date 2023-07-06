package RestAssuredAutomation.RestAp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	/**
	 * This methods used to wait on the findelemets and findelements on the the
	 * Webelemet
	 * 
	 * @author Prashanthchigarer
	 * @param driver
	 */

	public static void implicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	/**
	 * This is the inbuilt method used on Webelements on any Conditions to be
	 * satisfy
	 * 
	 * @author Prashanthchigarer
	 * @param driver
	 * @param WebElemet
	 */

	public static void ExplicitlyWait(WebDriver driver, By WebElemet) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(WebElemet));

	}

}
