package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AddComment_Page;
import pageObjects.RegisterNewUserWebsite_Page;
//import pageObjects.Scrolling_Page;




public class DriverFactory {
	public static WebDriver driver;
	//public static Scrolling_Page scrollingpage;
	public static RegisterNewUserWebsite_Page registerNewUserWebsite_page;
	public static AddComment_Page addcomment_page;



	@SuppressWarnings("deprecation")
	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					// DesiredCapabilities for unexpected alert
					DesiredCapabilities dc = new DesiredCapabilities();
					dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
					driver = new ChromeDriver(dc);
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				// code
				if (null == driver) {
					// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					// capabilities.setCapability("ignoreZoomSetting", true);
					 driver = new EdgeDriver(); 
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			//scrollingpage = PageFactory.initElements(driver, Scrolling_Page.class);
			registerNewUserWebsite_page = PageFactory.initElements(driver, RegisterNewUserWebsite_Page.class);
			addcomment_page = PageFactory.initElements(driver, AddComment_Page.class);
			}
		return driver;
	}
}
