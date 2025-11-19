package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseTest {
	public WebDriver driver;
	public Logger logger;  // Log4J files
	public Properties p;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String browser) throws IOException {
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		logger=LogManager.getLogger(this.getClass()); // This will get the class name 
		  											  //for which execution is carried and creates the logs
		switch(browser.toLowerCase()) {
		case "chrome":driver= new ChromeDriver(); break;
		case "edge":driver= new EdgeDriver(); break;
		default : System.out.println("Invalid input");return;
		}
		;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get(p.getProperty("url"));
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	public String randomString() {
		String s=RandomStringUtils.randomAlphabetic(6);
		return s;
	}
	public String randomNumber() {
		String s=RandomStringUtils.randomAlphanumeric(10);
		return s;
	}
	public String randomStringNumber() {
		String s=RandomStringUtils.randomAlphabetic(3);
		String n=RandomStringUtils.randomAlphanumeric(3);
		return (s+n);
	}
}

