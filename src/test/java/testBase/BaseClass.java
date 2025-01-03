package testBase;
	
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;


	
	public class BaseClass {
		
		//User
	     ReadConfig readconfig = new ReadConfig();
	     public String baseURL = readconfig.getApplicationURL();
	     public String username = readconfig.getUsername();
	     public String password = readconfig.getPassword();
//		 public  static Logger logger;
	  // public static  Logger logger = Logger.getLogger(BaseClass.class);
		
		public static WebDriver driver;
		public Logger logger;
		public Properties p;
		
		
		@BeforeClass
		@Parameters({"os","browser"})
		//public void setup(String os, String br) throws IOException
		
		public void setup(@Optional("Windows") String os, @Optional("chrome") String br) throws IOException
		{
			logger=LogManager.getLogger(this.getClass());
			
			FileReader file=new FileReader("./src//test//resources//config.properties");
			p=new Properties();
			p.load(file);
			
			switch(br.toLowerCase())
			{
			case "chrome" : driver=new ChromeDriver(); break;
			case "edge"   : driver=new EdgeDriver(); break;
			case "firefox": driver=new FirefoxDriver(); break;
			default: System.out.println("Invalid browser name..."); return;
			}
			
			//driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get(p.getProperty("baseURL"));
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys(p.getProperty("AdminEmail"));
		    //driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys(p.getProperty("AdminPass"));
			//driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}
		
		public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;

		}
	}