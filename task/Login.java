package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	public static void main(String[] arg) throws InterruptedException {
		Wrapper w = new Wrapper();// object for wrapper class for resuability of methods

		System.setProperty("webdriver.chrome.driver", "/Users/raghavig/eclipse-workspace/Task/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.qureos.com/");
		driver.manage().window().maximize();
		//enter username
		w.enterTextByXpath("//input[@placeholder='Email']", "raghaviganesh.29@gmail.com");
		// enter password
		w.enterTextByXpath("//input[@placeholder='Password']", "Password@123");

		// click Login
		w.clickByXpath("//button[text()='Login']");
		// wait for 3 secs
		Thread.sleep(3000);
		

		// Asserting Login
		boolean c = w.isElementEnabledByXpath("//div[text()='Hi Raghavi, welcome to your dashboard']");
		if (c == true) {
			System.out.println("Login successful and Testcase passed");
		} else {
			System.out.println("Login unsuccessful and testcase failed");
		}
	}
}
