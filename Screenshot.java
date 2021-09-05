package miniproject;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	//To capture the screenshot
	 public void Takescreenshot(WebDriver driver) {
		 TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(source,new File("./Screenshot/screen.png"));
				System.out.println("The Screenshot is captured");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }

}
