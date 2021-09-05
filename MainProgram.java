package miniproject;
import org.openqa.selenium.WebDriver;

public class MainProgram {
	public static void main(String[] args) {
		
		Yatra y= new Yatra();
		Screenshot s = new Screenshot();
		BrowserChoice bc = new BrowserChoice();
		WebDriver driver = bc.getWebDriver();
		y.OpenApplication(driver);
		y.clickOffers(driver);
		y.Title(driver);
		y.Logo(driver);
		s.Takescreenshot(driver);
		y.Display(driver);
		y.close(driver);
	}

}
