package task;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
	RemoteWebDriver driver;

	// Click By Xpath
	public void clickByXpath(String Xpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
			driver.findElement(By.xpath(Xpath)).click();
			System.out.println("Button Clicked Successfully");
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (WebDriverException e1) {
			System.out.println(e1);
		}
	}


//Enter Text by Xpath
	public void enterTextByXpath(String Xpath, String data) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
			driver.findElement(By.xpath(Xpath)).clear();
			driver.findElement(By.xpath(Xpath)).sendKeys(data);
			System.out.println("Entered value");
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (WebDriverException e1) {
			System.out.println(e1);
		}
	}
	
	public boolean isElementEnabledByXpath(String Xpath) {
		try {
			if (driver.findElement(By.xpath(Xpath)).isDisplayed()) {
				System.out.println("Element displayed");
			return true;
			}
			else {
				System.out.println("Element not displayed");
				return false;
		} }
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
