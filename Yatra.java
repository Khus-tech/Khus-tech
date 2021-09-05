package miniproject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yatra {
	 //Open yatra.com
public void OpenApplication(WebDriver driver) {
		
		driver.get("https://www.yatra.com/");
		
	}
//To click on Offers
public void clickOffers(WebDriver driver) {
	//Select the first option that appears in the search suggestion  
	
	driver.findElement(By.linkText("Offers")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}
//Add a check point to validate whether the browser title is "Domestic Flights Offers | Deals on Domestic Flight Booking | Yatra.com".
public void Title(WebDriver driver)
{
String title="Domestic Flights Offers | Deals on Domestic Flight Booking | Yatra.com";
if(title.equals(driver.getTitle())) {
	System.out.println("The browser title is Domestic Flights Offers | Deals on Domestic Flight Booking | Yatra.com");
	System.out.println("Title is verified");
	System.out.println("Test Cases are Passed \n");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	else {
		System.out.println("Not verified the page title \n");
		System.out.println("Test cases are Failed \n");
	}
}
//Add a check point to validate whether the banner logo is "Great Offers & Amazing Deals"
public void Logo(WebDriver driver)
{
	String actuallogo ="Great Offers & Amazing Deals";
	
	String expectedlogo=driver.findElement(By.xpath("//h2[@class='wfull bxs']")).getText();
//Add a check point to validate whether the banner logo is "Great Offers & Amazing Deals"
if(actuallogo.equals(expectedlogo)) {
	System.out.println("the banner logo is Great Offers & Amazing Deals");
	System.out.println("logo is verified");
	System.out.println("Test Cases are Passed \n");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
}
else {
	System.out.println("logo not verifed");
	System.out.println("Test Cases are Failed \n");
}
}

//List the five holiday packages with its price
public static ArrayList<String> getPackages(WebDriver driver)
{		
	driver.findElement(By.xpath("//*[@id=\"offer-box-shadow\"]/li[4]/a")).click();
	List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"collapsibleSection\"]/section[1]/div[2]/div/section/div/div/ul/li[*]/a/span/span/span[1]"));
	ArrayList<String> list=new ArrayList<String>();
	int cou=0;
	for (WebElement webElement : elements) {
		cou++;
		if(cou==6)
		{
			break;
		}
		else
		{
			list.add(webElement.getText());}
	}
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	return list;
	
	
}


public void Display(WebDriver driver) {
	// TODO Auto-generated method stub
	System.out.println("Five Holiday Packages with it's price : \n");
	int i=1;
	ArrayList<String> elements=getPackages(driver);
	for (String values  : elements) {
		System.out.println((i++)+"."+values+"\n");
	}
	
}
//Close the browser
public void close(WebDriver driver) {
	// TODO Auto-generated method stub
	driver.close();
	
}
}
