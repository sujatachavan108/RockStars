package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTestCase {
	RemoteWebDriver driver = null;

/**
	@Test
	public void invokeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.momondo.in");

	@Test(dependsOnMethods = "signInPage")
	public void clickOnMail() {

		driver.findElement(By.xpath("(//div[@class=\"Iqt3-button-content\"])[1]")).click();

	}
	@Test
	public void signInPage() {
		driver.findElement(By.cssSelector("div.sign-in-nav-link")).click();

	}
*/
	@Test
	public void getTitle() {//negative test case
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.momondo.in/horizon/sem/hotels/general?lang=en&skipapp=true&destination=c301166&kw=-1&gclid=CjwKCAjwve2TBhByEiwAaktM1HSpLEsXX1uWsBTtKVQZtaIEjIDDz7IRES7x7O5PGgrMQ5jQ_C9ECxoCVS4QAvD_BwE");
		WebElement element=driver.findElement(By.cssSelector("h1.n-tm"));
		String actual="Find hotel deals";
		String title=element.getText();
		Assert.assertEquals(actual, title);
		
	}
	/**
	@Test
	public void scrollWindow() throws InterruptedException {
		Thread.sleep(3000);
		driver.executeScript("window.scrollBy(0,1000)");

	}
*/
	

}
