package miniproject;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChoice {
	 WebDriver driver=null;
		public  WebDriver getWebDriver()
		{
		Scanner sc=new Scanner(System.in);	
		//Choosing the Web Browser
		System.out.println("Enter 1 for chrome \n 2 for firefox");
		int s =sc.nextInt();
		//Launching the browser according to configuration settings Firefox/Chrome.
			if(s==1)
			{
				//Chrome browser
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\akashsingh\\eclipse-workspace\\TripPackageAutomation\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
				
				
			}
			else if(s==2)
			{
				//Firefox browser
			System.setProperty("webdriver.gecko.driver","C:\\Users\\akashsingh\\eclipse-workspace\\TripPackageAutomation\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			}
			else {
				System.out.println("Invalid choice");
			}
				
			//Return the driver
		
			return driver;
		
		}

}
