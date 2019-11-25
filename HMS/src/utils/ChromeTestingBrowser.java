package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import startClass.StartClass;

public class ChromeTestingBrowser {
	public WebDriver driver;

	public WebDriver startHMSInChrome() throws InterruptedException {
		setupChromeDriver();
		String env = StartClass.environment.toUpperCase();
		
		if ("HMS_LOGIN_PAGE".equals(env)) {
			driver.get(ImportantHMSURLs.HMS_LOGIN_URL);
			Thread.sleep(5000);}
			//this.driver.get(ImportantHMSURLs.GUJARAT_CASE_CREATION_URL);
			//Thread.sleep(6000);
		return this.driver;
			
		}
		public void setupChromeDriver() {
			System.setProperty("webdriver.chrome.driver", DriverLocations.CHROME_DRIVER_PATH);
			ChromeOptions options = new ChromeOptions();
			//	 options.setAcceptInsecureCerts(true);
			  //      options.addArguments("disable-infobars");
				driver = new ChromeDriver(options);
		        driver.manage().window().maximize();
			
		}
}
