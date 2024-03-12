import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.getcalley.com/");
		//driver.findElement(By.xpath("class=\"no-js no-svg\""));
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium Softwares\\Test\\ScreenShots\\url1.png");
		Files.copy(src, dest);
		driver.close();
	}

}
